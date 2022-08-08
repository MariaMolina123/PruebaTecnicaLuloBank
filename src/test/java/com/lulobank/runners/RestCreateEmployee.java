package com.lulobank.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.lulobank.stepdefinitions",
        features = "src/test/resources/com/lulobank/features/create_employee.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RestCreateEmployee {

}
