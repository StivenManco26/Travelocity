package com.devco.certification.travelocity.questions;

import com.devco.certification.travelocity.userinterfaces.FavoritesListPage;
import com.devco.certification.travelocity.userinterfaces.ResultSearchThingToDoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class TheActivityWasAdded implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String initialActivityName = Text.of(ResultSearchThingToDoPage.FIRST_ACTIVITY_LABEL).viewedBy(actor).asString();
        actor.attemptsTo(Click.on(ResultSearchThingToDoPage.SIGN_IN_BUTTON),
                Click.on(ResultSearchThingToDoPage.LIST_OF_FAVORITES_BUTTON));
        initialActivityName = initialActivityName.substring(3);
        return Text.of(FavoritesListPage.FIRST_ITEM_LABEL).viewedBy(actor).asString().equalsIgnoreCase(initialActivityName);
    }

    public static TheActivityWasAdded toYourList() {
        return new TheActivityWasAdded();
    }
}
