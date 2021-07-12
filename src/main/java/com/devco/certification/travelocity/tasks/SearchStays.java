package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.userinterfaces.SearchStaysPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para realizar la busqueda de estadías en Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class SearchStays implements Task {
    @Override
    @Step("{0} Submit stays search")
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(SearchStaysPage.SEARCH_BUTTON));
    }

    public static SearchStays byClickingOnTheSearchButton() {
        return instrumented(SearchStays.class);
    }
}
