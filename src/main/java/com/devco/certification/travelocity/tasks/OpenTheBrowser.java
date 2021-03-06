package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.exeptions.WithoutConnectionToTheNetwork;
import com.devco.certification.travelocity.questions.TravelocityVisiblePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para realizar la apertura del navegador en la pagina
 * recibida como parametro PageObject en el metodo on.
 *
 * @author manco.5@hotmail.com
 */

public class OpenTheBrowser implements Task {

    private PageObject page;

    public OpenTheBrowser(PageObject page) {
        this.page = page;
    }

    @Override
    @Step("{0} Opens the browser on Travelocity home page ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.should(seeThat(TravelocityVisiblePage.isVisible()).orComplainWith(WithoutConnectionToTheNetwork.class,
                getNoInternetConectionMessage()));
    }
    public String getNoInternetConectionMessage() {
        return String.format(WithoutConnectionToTheNetwork.getErrorNetworkMessage());

    }
    public static OpenTheBrowser on(PageObject page) {
        return instrumented(OpenTheBrowser.class, page);
    }
}
