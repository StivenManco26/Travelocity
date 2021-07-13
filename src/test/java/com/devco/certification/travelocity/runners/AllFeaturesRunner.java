package com.devco.certification.travelocity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Clase encargada de correr todos los features
 *
 * @author manco.5@hotmail.com
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com.devco.certification.travelocity.stepdefinitions",
        tags = " @tag",
        snippets = SnippetType.CAMELCASE)

public class AllFeaturesRunner {
}
