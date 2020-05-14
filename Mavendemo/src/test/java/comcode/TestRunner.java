package comcode;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		tags= {"@productsearch"}
		,glue={"stepDefinition"}
		)

public class TestRunner {

}
