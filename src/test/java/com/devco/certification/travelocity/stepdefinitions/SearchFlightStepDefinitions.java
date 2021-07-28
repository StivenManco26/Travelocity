package com.devco.certification.travelocity.stepdefinitions;

import com.devco.certification.travelocity.models.SearchFlightModel;
import com.devco.certification.travelocity.questions.SearchFlightsResult;
import com.devco.certification.travelocity.tasks.FillSearchFields;
import com.devco.certification.travelocity.tasks.FilterByFlights;
import com.devco.certification.travelocity.tasks.OpenTheBrowser;
import com.devco.certification.travelocity.userinterfaces.TravelocityHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class SearchFlightStepDefinitions {

    @Managed(driver = "chrome",
            clearCookies = BeforeEachTest)
    private WebDriver hisBrowser;

    private Actor user = Actor.named("user");

    private TravelocityHomePage travelocityHomePage;

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
        user.wasAbleTo(OpenTheBrowser.on(travelocityHomePage));
    }

    @Given("^that the user wants enters the search parameters$")
    public void thatTheUserWantsEntersTheSearchParameters(List<SearchFlightModel> flightParameters) {
        user.wasAbleTo(FillSearchFields.with(flightParameters.get(0)));
    }

    @When("^he selects the filter morning$")
    public void heSelectsTheFilterMorning() {
        user.attemptsTo(FilterByFlights.inTheMorning());
    }

    @Then("^he should see the flights offered in the morning$")
    public void heShouldSeeTheFlightsOfferedInTheMorning() {
        user.should(seeThat(SearchFlightsResult.isFilterByMorning()));
    }
}
