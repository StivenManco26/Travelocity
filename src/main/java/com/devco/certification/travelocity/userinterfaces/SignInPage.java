package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina sign in de Travelocity
 *
 * @author manco.5@hotmail.com
 */

public class SignInPage extends PageObject {
    public static final Target EMAIL_TEXTBOX = Target.the("email textbox").located(By.id("signin-loginid"));
    public static final Target PASSWORD_TEXTBOX = Target.the("password textbox").located(By.id("signin-password"));
    public static final Target SUBMIT_BUTTON = Target.the("submit button").located(By.id("submitButton"));

}
