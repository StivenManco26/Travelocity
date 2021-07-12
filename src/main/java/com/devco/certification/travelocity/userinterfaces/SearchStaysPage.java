package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina de busqueda de estadias de Travelocity
 *
 * @author manco.5@hotmail.com
 */

public class SearchStaysPage extends PageObject {
    public static String initialDate;
    public static String finalDate;
    public static final Target GOING_TO_BUTTON = Target.the("going to button").located(By.xpath("//button[@class='uitk-faux-input' and @aria-label='Going to']"));
    public static final Target GOING_TO_TEXTBOX = Target.the("going to textbox").located(By.xpath("//input[@id='location-field-destination']"));
    public static final Target FIRST_ITEM_GOING_TO_LIST_BUTTON = Target.the("first item going to list button").located(By.xpath("//li[@data-index='0' and @data-stid='location-field-destination-result-item']"));
    public static final Target CHECK_IN_BUTTON = Target.the("check in button").located(By.xpath("//button[@id='d1-btn']"));
    public static final Target DATE_CHECK_IN_BUTTON = Target.the("date check in button").located(By.xpath("//button[contains(@aria-label,'" + initialDate + "')]"));
    public static final Target DONE_BUTTON = Target.the("done button").located(By.xpath("//button[@data-stid='apply-date-picker']"));
    public static final Target CHECK_OUT_BUTTON = Target.the("check out button").located(By.xpath("//button[@id='d2-btn']"));
    public static final Target DATE_CHECK_OUT_BUTTON = Target.the("date check out button").located(By.xpath("//button[contains(@aria-label,'" + finalDate + "')]"));
    public static final Target SEARCH_BUTTON = Target.the("search button").located(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']"));
}
