package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",plugin = "json:target/jsonReports/cucumber-report.json",
glue = {"stepDefinitions"}/*,tags= "@DeletePlace"*/)
public class TestRunner {

}

//mvn test
//mvn test -Dcucumber.options="--tags @AddPlace"
//generate reports
//mvn test verify