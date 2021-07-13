package com.devco.certification.travelocity.questions;

import com.devco.certification.travelocity.userinterfaces.TravelocityHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

/**
 * Clase Question para verificar el correcto cargue de la pagina.
 * Realizando una comparacion con un elemento de la pagina inicial de Travelocity
 *
 * @author manco.5@hotmail.com
 */

public class TravelocityVisiblePage implements Question<Boolean> {
    // verifica si el logo de travelocity esta visible para el actor
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(TravelocityHomePage.TRAVELOCITY_LOGO).answeredBy(actor).isCurrentlyVisible();
    }

    public static Question<Boolean> isVisible() {
        return new TravelocityVisiblePage();
    }
}
