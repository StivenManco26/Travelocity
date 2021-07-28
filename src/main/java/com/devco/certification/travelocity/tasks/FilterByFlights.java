package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.userinterfaces.ResultSearchFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para realizar el filtro de los vuelos
 * en el resultado de busqueda en Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class FilterByFlights implements Task {

    @Override
    @Step("{0} Filter the results of the flight search")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ResultSearchFlightPage.MORNING_BUTTON)
        );
    }

    public static FilterByFlights inTheMorning() {
        return instrumented(FilterByFlights.class);
    }
}
