package com.devco.certification.travelocity.stepdefinitions;

import com.devco.certification.travelocity.models.SearchStaysModel;
import com.devco.certification.travelocity.questions.SearchStaysResult;
import com.devco.certification.travelocity.tasks.FillSearchStaysFields;
import com.devco.certification.travelocity.tasks.OpenTheBrowser;
import com.devco.certification.travelocity.tasks.SearchStays;
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

public class SearchStaysStepDefinitions {

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
    @Given("^that the user wants enters the parameters for stays search$")
    public void thatTheUserWantsEntersTheParametersForStaysSearch(List<SearchStaysModel> staysParameters) {
        user.wasAbleTo(FillSearchStaysFields.with(staysParameters.get(0)));
    }

    @When("^he clicks the search button$")
    public void heClicksTheSearchButton() {
        user.attemptsTo(SearchStays.byClickingOnTheSearchButton());
    }

    @Then("^he should see the stays offered in (.*)$")
    public void heShouldSeeTheStaysOfferedIn(String destination) {
        user.should(seeThat(SearchStaysResult.containsTheDesiredDestination(destination)));
    }
}
