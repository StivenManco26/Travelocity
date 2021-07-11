package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.questions.TravelocityVisiblePage;
import com.devco.certification.travelocity.userinterfaces.TravelocityHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para realizar la apertura de la pagina de inicio de sesion
 *
 * @author manco.5@hotmail.com
 */

public class EnterToSignInPage implements Task {
    private PageObject page;

    public EnterToSignInPage(PageObject page) {
        this.page = page;
    }

    @Override
    @Step("{0} Opens the sign in page")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(TravelocityHomePage.SIGNINHOME_BUTTON),
                Click.on(TravelocityHomePage.SIGNIN_BUTTON));
        // Verifica que efectivamente se abre la pagina de sign in, de lo contrario arroja un
        // AssertionError
        //actor.should(seeThat(TravelocityVisiblePage.isVisible()));
    }

    // metodo que llama al instrumented que crea una instancia en tiempo de
    // ejecución, con el parametro de tipo PageObject
    public static EnterToSignInPage on(PageObject page) {
        return instrumented(EnterToSignInPage.class, page);
    }
}
