package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.models.SearchFlightModel;
import com.devco.certification.travelocity.userinterfaces.SearchFlightPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para realizar el ingreso de los parametros
 * de busqueda en Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class FillSearchFields implements Task {

    // modelo de clase que almacena los parametros de busqueda
    private SearchFlightModel searchFlightModel;

    // constructor de la tarea
    public FillSearchFields(SearchFlightModel searchFlightModel) {
        this.searchFlightModel = searchFlightModel;
    }

    // Desarrollo de la tarea
    @Override
    @Step("{0} Enter the parameters for the search")
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(SearchFlightPage.FLIGHTS_BUTTON),
                Click.on(SearchFlightPage.ONE_WAY_BUTTON),
                Click.on(SearchFlightPage.LEAVING_FROM_BUTTON),
                Enter.theValue(searchFlightModel.getOrigin()).into(SearchFlightPage.LEAVING_FROM_TEXTBOX),
                Click.on(SearchFlightPage.FIRST_ITEM_LEAVING_FROM_LIST_BUTTON),
                Click.on(SearchFlightPage.GOING_TO_BUTTON),
                Enter.theValue(searchFlightModel.getDestination()).into(SearchFlightPage.GOING_TO_TEXTBOX),
                Click.on(SearchFlightPage.FIRST_ITEM_GOING_TO_LIST_BUTTON),
                Click.on(SearchFlightPage.DEPARTING_BUTTON),
                Click.on(Target.the("date departing button").located(By.xpath("//button[contains(@aria-label,'" + searchFlightModel.getDeparting() + "')]"))),
                Click.on(SearchFlightPage.DONE_DEPARTING_BUTTON),
                Click.on(SearchFlightPage.SEARCH_BUTTON)
                );
    }
    // metodo que llama al instrumented que crea una instancia en tiempo de
    // ejecución, con el parametro de tipo UserModel
    public static FillSearchFields with(SearchFlightModel searchFlightModel) {
        return instrumented(FillSearchFields.class, searchFlightModel);
    }
}
