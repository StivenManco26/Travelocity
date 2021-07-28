package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.models.SearchFlightModel;
import com.devco.certification.travelocity.userinterfaces.SearchFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Clase Task (tarea) para realizar el ingreso de los parametros
 * de busqueda en Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class FillSearchFields implements Task {

    private SearchFlightModel searchFlightModel;

    public FillSearchFields(SearchFlightModel searchFlightModel) {
        SearchFlightPage.selectedDateFor(searchFlightModel.getDeparting());
        this.searchFlightModel = searchFlightModel;
    }

    @Override
    @Step("{0} Enter the parameters for the search")
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(SearchFlightPage.FLIGHTS_BUTTON),
                Click.on(SearchFlightPage.ONE_WAY_BUTTON),
                Click.on(SearchFlightPage.LEAVING_FROM_BUTTON),
                Enter.theValue(searchFlightModel.getOrigin()).into(SearchFlightPage.LEAVING_FROM_TEXTBOX),
                WaitUntil.the(SearchFlightPage.FIRST_ITEM_LEAVING_FROM_LIST_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SearchFlightPage.FIRST_ITEM_LEAVING_FROM_LIST_BUTTON),
                Click.on(SearchFlightPage.GOING_TO_BUTTON),
                Enter.theValue(searchFlightModel.getDestination()).into(SearchFlightPage.GOING_TO_TEXTBOX),
                WaitUntil.the(SearchFlightPage.FIRST_ITEM_GOING_TO_LIST_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SearchFlightPage.FIRST_ITEM_GOING_TO_LIST_BUTTON),
                Click.on(SearchFlightPage.DEPARTING_BUTTON),
                Click.on(SearchFlightPage.DATE_DEPARTING_BUTTON),
                Click.on(SearchFlightPage.DONE_DEPARTING_BUTTON),
                Click.on(SearchFlightPage.SEARCH_BUTTON)
                );
    }
    public static FillSearchFields with(SearchFlightModel searchFlightModel) {
        return instrumented(FillSearchFields.class, searchFlightModel);
    }
}
