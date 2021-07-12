package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina de resultados de la
 * busqueda de vuelos de Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class ResultSearchFlightPage extends PageObject {

    public static final Target MORNING_BUTTON = Target.the("morning button").located(By.xpath("//label[@for='arrival-time-MORNING']"));
    public static final Target MORNING_FILTER_BUTTON = Target.the("morning filter button").located(By.xpath("//span[@class='uitk-pill-text']"));

}
