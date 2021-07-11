package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina principal de Travelocity
 *
 * @author manco.5@hotmail.com
 */

@DefaultUrl("https://www.travelocity.com/")
public class TravelocityHomePage extends PageObject {
    public static final Target SEARCH_BUTTON = Target.the("search button").located(By.className("uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary"));
    public static final Target TRAVELOCITY_LOGO = Target.the("travelocity logo").located(By.className("large-logo"));
    public static final Target SIGNIN_BUTTON = Target.the("signin button").located(By.xpath("//a[.='Sign in']"));
    public static final Target SIGNINHOME_BUTTON = Target.the("signin home button").located(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger']"));
}
