package com.devco.certification.travelocity.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_activity_to_my_list.feature",
        glue = "com.devco.certification.travelocity.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class AddActivityToMyListRunner {
}