package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina de busqueda de vuelos de Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class SearchFlightPage extends PageObject {

    public static String date;
    public static final Target FLIGHTS_BUTTON = Target.the("flights button").located(By.xpath("//span[contains(text(),'Flights')]"));
    public static final Target ONE_WAY_BUTTON = Target.the("one way button").located(By.xpath("//span[contains(text(),'One-way')]"));
    public static final Target LEAVING_FROM_BUTTON = Target.the("leaving from button").located(By.xpath("//button[@class='uitk-faux-input' and @aria-label='Leaving from']"));
    public static final Target LEAVING_FROM_TEXTBOX = Target.the("leaving from textbox").located(By.xpath("//input[@id='location-field-leg1-origin']"));
    public static final Target FIRST_ITEM_LEAVING_FROM_LIST_BUTTON = Target.the("first item leaving from list button").located(By.xpath("//li[@data-index='0']"));
    public static final Target GOING_TO_BUTTON = Target.the("going to button").located(By.xpath("//button[@class='uitk-faux-input' and @aria-label='Going to']"));
    public static final Target GOING_TO_TEXTBOX = Target.the("going to textbox").located(By.xpath("//input[@id='location-field-leg1-destination']"));
    public static final Target FIRST_ITEM_GOING_TO_LIST_BUTTON = Target.the("first item going to list button").located(By.xpath("//li[@data-index='0' and @data-stid='location-field-leg1-destination-result-item']"));
    public static final Target DEPARTING_BUTTON = Target.the("departing button").located(By.xpath("//button[@id='d1-btn']"));
    public static final Target DATE_DEPARTING_BUTTON = Target.the("date departing button").located(By.xpath("//button[contains(@aria-label,'" + date + "')]"));
    public static final Target DONE_DEPARTING_BUTTON = Target.the("done departing button").located(By.xpath("//button[@data-stid='apply-date-picker']"));
    public static final Target SEARCH_BUTTON = Target.the("search button").located(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']"));
}
