package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina de busqueda de Cosas por hacer de Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class SearchThingToDoPage extends PageObject {
    public static String initialDate;
    public static String finalDate;
    public static final Target THING_TO_DO_BUTTON = Target.the("thing to do button").located(By.xpath("//span[.='Things to do']"));
    public static final Target THING_TO_DO_IN_BUTTON = Target.the("thing to do in button").located(By.xpath("//button[@class='uitk-faux-input' and @aria-label='Things to do in']"));
    public static final Target LOCATION_TEXTBOX = Target.the("location textbox").located(By.xpath("//input[@id='location-field-location']"));
    public static final Target FIRST_ITEM_LOCATION_LIST_BUTTON = Target.the("first item location list button").located(By.xpath("//li[@data-index='0' and @data-stid='location-field-location-result-item']"));
    public static final Target FROM_BUTTON = Target.the("from button").located(By.xpath("//button[@id='d1-btn']"));
    public static final Target DATE_FROM_BUTTON = Target.the("date from button").located(By.xpath("//button[contains(@aria-label,'" + initialDate + "')]"));
    public static final Target DONE_BUTTON = Target.the("done button").located(By.xpath("//button[@data-stid='apply-date-picker']"));
    public static final Target TO_BUTTON = Target.the("to button").located(By.xpath("//button[@id='d2-btn']"));
    public static final Target DATE_TO_BUTTON = Target.the("date to button").located(By.xpath("//button[contains(@aria-label,'" + finalDate + "')]"));
    public static final Target SEARCH_BUTTON = Target.the("search button").located(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']"));
}

