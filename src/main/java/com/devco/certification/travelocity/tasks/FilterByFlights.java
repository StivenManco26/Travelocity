package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.models.SearchFlightModel;
import com.devco.certification.travelocity.userinterfaces.ResultSearchFlightPage;
import com.devco.certification.travelocity.userinterfaces.SearchFlightPage;
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

    // Desarrollo de la tarea
    @Override
    @Step("{0} Filter the results of the flight search")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ResultSearchFlightPage.MORNING_BUTTON)
        );
    }

    // metodo que llama al instrumented que crea una instancia en tiempo de
    // ejecución, con el parametro de tipo UserModel
    public static FilterByFlights inTheMorning() {
        return instrumented(FilterByFlights.class);
    }
}
