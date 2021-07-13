package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina de resultados
 * de la busqueda de Cosas por hacer de Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class ResultSearchThingToDoPage extends PageObject {
    public static final Target ADD_TO_LIST_BUTTON = Target.the("add to list button").located(By.xpath("//section[@data-testid='Top 10 things to do-activity-carousel--section']/child::div[2]/child::div[1]//child::li[1]//child::label/child::div[1]"));
    public static final Target FIRST_ACTIVITY_LABEL = Target.the("first activity label").located(By.xpath("//section[@data-testid='Top 10 things to do-activity-carousel--section']//child::div[2]/child::div[1]//child::li[1]/child::a[1]/child::span[1]"));
    public static final Target SIGN_IN_BUTTON = Target.the("sign in button").located(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger']"));
    public static final Target LIST_OF_FAVORITES_BUTTON = Target.the("list of favorites button").located(By.xpath("//div[.='List of favorites']"));

}
