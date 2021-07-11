package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina principal de Travelocity
 * con el usuario logueado correctamente
 * @author manco.5@hotmail.com
 */

public class TravelocityLoggedUserPage extends PageObject {
    public static final Target USER_LOGGED_LABEL = Target.the("user logged label").located(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger']"));
}
