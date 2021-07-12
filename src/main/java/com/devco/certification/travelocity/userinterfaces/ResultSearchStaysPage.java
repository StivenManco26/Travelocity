package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina de resultados de la
 * busqueda de estadías de Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class ResultSearchStaysPage extends PageObject {
    public static final Target FIRST_HOTEL_PLACE_LABEL = Target.the("first hotel place label").located(By.xpath("//ol[@class='results-list no-bullet']/child::li[1]//child::div[1 and @data-test-id='content-hotel-neighborhood']"));
    //div[@data-test-id='content-hotel-neighborhood']
}
