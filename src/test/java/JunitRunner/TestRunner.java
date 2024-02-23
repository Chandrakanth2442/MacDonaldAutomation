package JunitRunner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Users/macbookair/Downloads/macdfi/feature"},
glue = "CommonStepDefinition",
monochrome=true,
plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt",
		"json:target/cucumber-reports/CucumberTestReport.json" }
)
public class TestRunner  {
 
}
