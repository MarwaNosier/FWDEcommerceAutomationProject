package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src\\main\\resources\\Features",
        glue = "StepDefinition",
        plugin = { "html:target/Project_reports/report.html",
                "json:target/Project_reports/cucumber.json",
                "junit:target/Project_reports/cucumber.xml"
        },
        tags = "@smoke"
)
public class runner {
}
