package com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina de la lista de favoritos
 *
 * @author manco.5@hotmail.com
 */
public class FavoritesListPage extends PageObject {
    public static final Target FIRST_ITEM_LABEL = Target.the("first item label").located(By.xpath("//a[contains(@href,'activity-details')]/span"));


}
