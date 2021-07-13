package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.models.ThingToDoSearchModel;
import com.devco.certification.travelocity.userinterfaces.SearchThingToDoPage;
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
 * de busqueda de cosas por hacer en Travelocity
 *
 * @author manco.5@hotmail.com
 */

public class FillSearchThingToDoFields implements Task {
    // modelo de clase que almacena los parametros de busqueda
    private ThingToDoSearchModel thingToDoSearchModel;

    // constructor de la tarea
    public FillSearchThingToDoFields(ThingToDoSearchModel thingToDoSearchModel) {
        this.thingToDoSearchModel = thingToDoSearchModel;
    }
    // Desarrollo de la tarea
    @Override
    @Step("{0} Enter the parameters for the Thing to do search")
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(SearchThingToDoPage.THING_TO_DO_BUTTON),
                Click.on(SearchThingToDoPage.THING_TO_DO_IN_BUTTON),
                Enter.theValue(thingToDoSearchModel.getLocation()).into(SearchThingToDoPage.LOCATION_TEXTBOX),
                WaitUntil.the(SearchThingToDoPage.FIRST_ITEM_LOCATION_LIST_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SearchThingToDoPage.FIRST_ITEM_LOCATION_LIST_BUTTON),
                Click.on(SearchThingToDoPage.FROM_BUTTON),
                Click.on(Target.the("date from button").located(By.xpath("//button[contains(@aria-label,'" + thingToDoSearchModel.getFrom() + "')]"))),
                Click.on(SearchThingToDoPage.DONE_BUTTON),
                Click.on(SearchThingToDoPage.TO_BUTTON),
                Click.on(Target.the("date to button").located(By.xpath("//button[contains(@aria-label,'" + thingToDoSearchModel.getTo() + "')]"))),
                Click.on(SearchThingToDoPage.DONE_BUTTON),
                Click.on(SearchThingToDoPage.SEARCH_BUTTON)
                );
    }
    // metodo que llama al instrumented que crea una instancia en tiempo de
    // ejecución, con el parametro de tipo searchStaysModel
    public static FillSearchThingToDoFields with(ThingToDoSearchModel thingToDoSearchModel) {
        return instrumented(FillSearchThingToDoFields.class, thingToDoSearchModel);
    }
}