package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.models.SearchStaysModel;
import com.devco.certification.travelocity.userinterfaces.SearchStaysPage;
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
 * de busqueda de estadias en Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class FillSearchStaysFields implements Task {

    private SearchStaysModel searchStaysModel;

    public FillSearchStaysFields(SearchStaysModel searchStaysModel) {
        SearchStaysPage.selectedDateCheckInFor(searchStaysModel.getCheckIn());
        SearchStaysPage.selectedDateCheckOutFor(searchStaysModel.getCheckOut());
        this.searchStaysModel = searchStaysModel;
    }
    @Override
    @Step("{0} Enter the parameters for the search stays")
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(SearchStaysPage.GOING_TO_BUTTON),
                Enter.theValue(searchStaysModel.getDestination()).into(SearchStaysPage.GOING_TO_TEXTBOX),
                WaitUntil.the(SearchStaysPage.FIRST_ITEM_GOING_TO_LIST_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SearchStaysPage.FIRST_ITEM_GOING_TO_LIST_BUTTON),
                Click.on(SearchStaysPage.CHECK_IN_BUTTON),
                Click.on(SearchStaysPage.DATE_CHECK_IN_BUTTON),
                Click.on(SearchStaysPage.DONE_BUTTON),
                Click.on(SearchStaysPage.CHECK_OUT_BUTTON),
                Click.on(SearchStaysPage.DATE_CHECK_OUT_BUTTON),
                Click.on(SearchStaysPage.DONE_BUTTON)
                );
    }
    public static FillSearchStaysFields with(SearchStaysModel searchStaysModel) {
        return instrumented(FillSearchStaysFields.class, searchStaysModel);
    }

}
