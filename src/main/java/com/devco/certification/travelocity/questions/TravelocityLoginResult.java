package com.devco.certification.travelocity.questions;

import com.devco.certification.travelocity.userinterfaces.TravelocityLoggedUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

/**
 * Clase Question para vereficar el ingreso correcto del login
 * @author manco.5@hotmail.com
 */

public class TravelocityLoginResult implements Question<Boolean> {

    private String initialName;
    private static String errorMessage = "wrong credentials or captch";

    //Constructor de la clase
    public TravelocityLoginResult(String initialName) {
        setInitialName(initialName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String finalName = Text.of(TravelocityLoggedUserPage.USER_LOGGED_LABEL).viewedBy(actor).asString();
        return verifyUserLogged(getInitialName(), finalName);
    }

    private Boolean verifyUserLogged(String initialName, String finalName) {
        return initialName.equalsIgnoreCase(finalName);
    }

    public static TravelocityLoginResult containsTheUsername(String initialName) {
        return new TravelocityLoginResult(initialName);
    }

    public static String getErrorMessage() {
        return errorMessage;
    }

    public String getInitialName() {
        return initialName;
    }

    public void setInitialName(String initialName) {
        this.initialName = initialName;
    }
}
