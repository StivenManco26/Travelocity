package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina
 * de busqueda de servicio de carro de Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class SearchCarsPage extends PageObject {
    public static String date;
    public static final Target CARS_BUTTON = Target.the("cars button").located(By.xpath("//ul[@id='uitk-tabs-button-container']//a[.='Cars']"));
    public static final Target AIRPORT_TRANSPORTATION_BUTTON = Target.the("airport transportation button").located(By.xpath("//span[.='Airport transportation']"));
    public static final Target AIRPORT_BUTTON = Target.the("airport button").located(By.xpath("//div[@id='location-field-location-menu']//button[@class='uitk-faux-input']"));
    public static final Target AIRPORT_TEXTBOX = Target.the("airport textbox").located(By.xpath("//input[@id='location-field-location']"));
    public static final Target FIRST_ITEM_AIRPORT_BUTTON = Target.the("first item airport button").located(By.xpath("//li[@data-index='0']"));
    public static final Target HOTEL_NAME_BUTTON = Target.the("hotel name button").located(By.xpath("//div[@id='location-field-hotelName-menu']//button[@class='uitk-faux-input']"));
    public static final Target HOTEL_NAME_TEXTBOX = Target.the("hotel name textbox").located(By.xpath("//input[@id='location-field-hotelName']"));
    public static final Target FIRST_ITEM_HOTEL_NAME_BUTTON = Target.the("first item hotel name button").located(By.xpath("//li[@data-index='0' and @data-stid='location-field-hotelName-result-item']"));
    public static final Target FLIGHT_ARRIVAL_DATE_BUTTON = Target.the("flight arrival date button").located(By.xpath("//button[@class='uitk-faux-input uitk-form-field-trigger']"));
    public static final Target DATE_BUTTON = Target.the("date button").located(By.xpath("//button[contains(@aria-label,'" + date + "')]"));
    public static final Target DONE_BUTTON = Target.the("done button").located(By.xpath("//button[@data-stid='apply-date-picker']"));
    public static final Target SEARCH_BUTTON = Target.the("search button").located(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']"));
}
