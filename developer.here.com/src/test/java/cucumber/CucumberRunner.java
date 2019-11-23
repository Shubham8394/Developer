package test.java.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		monochrome = true,
		features = "src/test/java/feature",
		glue = {"test.java.stepDefs"},
		plugin = {"pretty", "html:target/Destination"}
		)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
