package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.models.SearchCarsModel;
import com.devco.certification.travelocity.userinterfaces.SearchCarsPage;
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
 * de busqueda de servicio de carro en Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class FillSearchCarsFields implements Task {

    // modelo de clase que almacena los parametros de busqueda
    private SearchCarsModel searchCarsModel;

    // constructor de la tarea
    public FillSearchCarsFields(SearchCarsModel searchCarsModel) {
        SearchCarsPage.selectedDateFor(searchCarsModel.getFlightArrivalDate());
        this.searchCarsModel = searchCarsModel;
    }

    // Desarrollo de la tarea
    @Override
    @Step("{0} Enter the parameters for the cars search")
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(SearchCarsPage.CARS_BUTTON),
                Click.on(SearchCarsPage.AIRPORT_TRANSPORTATION_BUTTON),
                Click.on(SearchCarsPage.AIRPORT_BUTTON),
                Enter.theValue(searchCarsModel.getAirport()).into(SearchCarsPage.AIRPORT_TEXTBOX),
                WaitUntil.the(SearchCarsPage.FIRST_ITEM_AIRPORT_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SearchCarsPage.FIRST_ITEM_AIRPORT_BUTTON),
                Click.on(SearchCarsPage.HOTEL_NAME_BUTTON),
                Enter.theValue(searchCarsModel.getHotel()).into(SearchCarsPage.HOTEL_NAME_TEXTBOX),
                WaitUntil.the(SearchCarsPage.FIRST_ITEM_HOTEL_NAME_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SearchCarsPage.FIRST_ITEM_HOTEL_NAME_BUTTON),
                Click.on(SearchCarsPage.FLIGHT_ARRIVAL_DATE_BUTTON),
                Click.on(SearchCarsPage.DATE_BUTTON),
                Click.on(SearchCarsPage.DONE_BUTTON),
                Click.on(SearchCarsPage.SEARCH_BUTTON)
                );
    }
    // metodo que llama al instrumented que crea una instancia en tiempo de
    // ejecución, con el parametro de tipo UserModel
    public static FillSearchCarsFields with(SearchCarsModel searchCarsModel) {
        return instrumented(FillSearchCarsFields.class, searchCarsModel);
    }
}
