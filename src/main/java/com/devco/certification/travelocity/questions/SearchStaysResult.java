package com.devco.certification.travelocity.questions;

import com.devco.certification.travelocity.userinterfaces.ResultSearchStaysPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
/**
 * Clase Question para verificar la correcta busqueda de estadias.
 * Realizando una comparacion del lugar de destino buscado y el
 * lugar de destino obtenido en el primer resultado de la busqueda
 * @author manco.5@hotmail.com
 */
public class SearchStaysResult implements Question<Boolean> {

    private String destination;

    public SearchStaysResult(String destination) {
        this.destination = destination;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(ResultSearchStaysPage.FIRST_HOTEL_PLACE_LABEL).viewedBy(actor).asString().equalsIgnoreCase(destination);
    }

    public static SearchStaysResult containsTheDesiredDestination(String destination) {
        return new SearchStaysResult(destination);
    }
}
