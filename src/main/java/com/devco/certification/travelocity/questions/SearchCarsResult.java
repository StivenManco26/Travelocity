package com.devco.certification.travelocity.questions;

import com.devco.certification.travelocity.userinterfaces.ResultSearchCarsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Clase Question para verificar la correcta busqueda de carros.
 * Realizando una comparacion del lugar de buscado y el
 * lugar obtenido en la busqueda
 * @author manco.5@hotmail.com
 */
public class SearchCarsResult implements Question<Boolean> {

    private String location;
    private String finalLocation;

    public SearchCarsResult(String location) {
        this.location = location;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        location = location.toLowerCase();
        finalLocation = Text.of(ResultSearchCarsPage.SEARCH_SUMMARY_LABEL).viewedBy(actor).asString().toLowerCase();
        return finalLocation.contains(location);
    }

    public static SearchCarsResult isGivenInTheDesired(String location) {
        return new SearchCarsResult(location);
    }
}
