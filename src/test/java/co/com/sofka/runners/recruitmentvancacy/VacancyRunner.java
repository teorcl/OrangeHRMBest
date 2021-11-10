package co.com.sofka.runners.recruitmentvancacy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        plugin = {"pretty","html:target/cucumber-report/cucumber.html"},
        features = {"src/test/resources/features/webui/orangehrm/vacancy.feature"},
        glue = {"co.com.sofka.stepdefinitions.recruitmentvacancy"}
)
public class VacancyRunner {
}
