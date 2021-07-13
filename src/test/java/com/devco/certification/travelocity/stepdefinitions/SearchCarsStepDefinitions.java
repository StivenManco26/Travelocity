package com.devco.certification.travelocity.stepdefinitions;

import com.devco.certification.travelocity.models.SearchCarsModel;
import com.devco.certification.travelocity.questions.SearchCarsResult;
import com.devco.certification.travelocity.tasks.FillSearchCarsFields;
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

public class SearchCarsStepDefinitions {
    @Managed(driver = "chrome",
            clearCookies = BeforeEachTest)
    private WebDriver hisBrowser;

    private Actor user = Actor.named("user");

    private TravelocityHomePage travelocityHomePage;

    // Inicialización del driver a cargo del actor
    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^that the user wants search a airport transportation cars service$")
    public void thatTheUserWantsSearchAAirportTransportationCarsService() {
        user.wasAbleTo(OpenTheBrowser.on(travelocityHomePage));
    }


    @When("^he enters the search parameters$")
    public void heEntersTheSearchParameters(List<SearchCarsModel> searchCarsModel) {
        user.attemptsTo(FillSearchCarsFields.with(searchCarsModel.get(0)));
    }

    @Then("^he should see the cars service offered in his location$")
    public void heShouldSeeTheCarsServiceOfferedInHisLocation(List<String> location) {
        user.should(seeThat(SearchCarsResult.isGivenInTheDesired(location.get(1))));
    }
}
