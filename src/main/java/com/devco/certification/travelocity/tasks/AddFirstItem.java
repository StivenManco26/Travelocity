package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.userinterfaces.ResultSearchThingToDoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Clase Task (tarea) para realizar el ingreso del primer
 * resultado de la busqueda de cosas por hacer en Travelocity
 * a la lista de favoritos.
 *
 * @author manco.5@hotmail.com
 */
public class AddFirstItem implements Task {
    @Override
    @Step("{0} Enter the first item of the Thing to do search in your list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ResultSearchThingToDoPage.ADD_TO_LIST_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ResultSearchThingToDoPage.ADD_TO_LIST_BUTTON)
        );
    }

    public static AddFirstItem atYourList() {
        return instrumented(AddFirstItem.class);
    }
}
