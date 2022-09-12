package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"html:target\\cucumber-reports.html"},
        glue = "stepdefinitions",
        dryRun = false,
        tags="@tc01"



)

public class TestRunner {

}
