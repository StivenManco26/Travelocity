package com.devco.certification.travelocity.stepdefinitions;

import com.devco.certification.travelocity.models.ThingToDoSearchModel;
import com.devco.certification.travelocity.questions.TheActivityWasAdded;
import com.devco.certification.travelocity.tasks.AddFirstItem;
import com.devco.certification.travelocity.tasks.FillSearchThingToDoFields;
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

public class AddActivityToMyListStepDefinitions {

    @Managed(driver = "chrome",
            clearCookies = BeforeEachTest)
    private WebDriver hisBrowser;

    private Actor user = Actor.named("user");

    private TravelocityHomePage travelocityHomePage;

    // Inicialización del driver a cargo del actor
    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
        user.wasAbleTo(OpenTheBrowser.on(travelocityHomePage));
    }

    @Given("^that the user enters the parameters for thing to do search$")
    public void thatTheUserEntersTheParametersForThingToDoSearch(List<ThingToDoSearchModel> thingToDoSearchModel) {
        user.wasAbleTo(FillSearchThingToDoFields.with(thingToDoSearchModel.get(0)));
    }


    @When("^he attempts add the first result at your list$")
    public void heAttemptsAddTheFirstResultAtYourList() {
        user.attemptsTo(AddFirstItem.atYourList());
    }

    @Then("^he should see the activity in your list$")
    public void heShouldSeeTheActivityInYourList() {
        user.should(seeThat(TheActivityWasAdded.toYourList()));
    }

}
