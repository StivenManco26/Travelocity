package com.devco.certification.travelocity.questions;

import com.devco.certification.travelocity.userinterfaces.ResultSearchFlightPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SearchFlightsResult implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(ResultSearchFlightPage.MORNING_FILTER_BUTTON).viewedBy(actor).asString().equalsIgnoreCase("Arrival time - Morning (5:00am - 11:59am)");
    }

    public static SearchFlightsResult isFilterByMorning() {
        return new SearchFlightsResult();
    }
}
