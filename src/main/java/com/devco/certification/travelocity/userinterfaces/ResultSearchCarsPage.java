package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina de resultados de la
 * busqueda de servicio de transporte de Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class ResultSearchCarsPage extends PageObject {
    public static final Target SEARCH_SUMMARY_LABEL = Target.the("search summary label").located(By.xpath("//h2[@class='uitk-heading-4']"));
}
