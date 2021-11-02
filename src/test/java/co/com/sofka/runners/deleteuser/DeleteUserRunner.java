package co.com.sofka.runners.deleteuser;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        plugin = {"pretty","html:target/cucumber-report/cucumber.html"},
        features = {"src/test/resources/features/webui/orangehrm/deleteuser.feature"},
        glue = {"co.com.sofka.stepdefinitions.deleteuser"}
)
public class DeleteUserRunner {
}
