package com.devco.certification.travelocity.stepdefinitions;

import java.util.List;

import com.devco.certification.travelocity.models.UserModel;
import com.devco.certification.travelocity.questions.TravelocityLoginResult;
import com.devco.certification.travelocity.tasks.EnterThe;
import com.devco.certification.travelocity.tasks.EnterToSignInPage;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;


public class LoginStepDefinitions {

    @Managed(driver = "chrome",
            clearCookies=BeforeEachTest)
    private WebDriver hisBrowser;

    private Actor user = Actor.named("user");

    private TravelocityHomePage travelocityHomePage;

    // Inicialización del driver a cargo del actor
    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    // Inicializa el WebDriver en la pagina de Travelocity
    @Given("^that User wants sign in into Travelocity$")
    public void thatUserWantsSignInIntoTravelocity() {
        user.wasAbleTo(OpenTheBrowser.on(travelocityHomePage));
        user.attemptsTo(EnterToSignInPage.on(travelocityHomePage));
    }

    @When("^he enter the username and password$")
    public void heEnterTheUsernameAndPassword(List<UserModel> credentials) {
        user.attemptsTo(EnterThe.credentials(credentials.get(0)));
    }

    @Then("^To should see his name in the next page$")
    public void toShouldSeeHisNameInTheNextPage(List<String> name) {
        //user.should(seeThat(TravelocityLoginResult.page()).orComplainWith(UnableToLogin.class,
                //getUnableToLoginMessage()));
        user.should(seeThat(TravelocityLoginResult.containsTheUsername(name.get(1))));
    }
}
