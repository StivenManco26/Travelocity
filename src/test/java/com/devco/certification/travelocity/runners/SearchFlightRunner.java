package com.devco.certification.travelocity.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_flight.feature",
        glue = "com.devco.certification.travelocity.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class SearchFlightRunner {
}
