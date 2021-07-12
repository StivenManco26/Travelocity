package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.models.SearchStaysModel;
import com.devco.certification.travelocity.userinterfaces.SearchStaysPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
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

    // modelo de clase que almacena los parametros de busqueda
    private SearchStaysModel searchStaysModel;

    // constructor de la tarea
    public FillSearchStaysFields(SearchStaysModel searchStaysModel) {
        this.searchStaysModel = searchStaysModel;
    }
    // Desarrollo de la tarea
    @Override
    @Step("{0} Enter the parameters for the search stays")
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(SearchStaysPage.GOING_TO_BUTTON),
                Enter.theValue(searchStaysModel.getDestination()).into(SearchStaysPage.GOING_TO_TEXTBOX),
                WaitUntil.the(SearchStaysPage.FIRST_ITEM_GOING_TO_LIST_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SearchStaysPage.FIRST_ITEM_GOING_TO_LIST_BUTTON),
                Click.on(SearchStaysPage.CHECK_IN_BUTTON),
                Click.on(Target.the("date check in button").located(By.xpath("//button[contains(@aria-label,'" + searchStaysModel.getCheckIn() + "')]"))),
                Click.on(SearchStaysPage.DONE_BUTTON),
                Click.on(SearchStaysPage.CHECK_OUT_BUTTON),
                Click.on(Target.the("date check out button").located(By.xpath("//button[contains(@aria-label,'" + searchStaysModel.getCheckOut() + "')]"))),
                Click.on(SearchStaysPage.DONE_BUTTON)
                );
    }
    // metodo que llama al instrumented que crea una instancia en tiempo de
    // ejecución, con el parametro de tipo searchStaysModel
    public static FillSearchStaysFields with(SearchStaysModel searchStaysModel) {
        return instrumented(FillSearchStaysFields.class, searchStaysModel);
    }

}
