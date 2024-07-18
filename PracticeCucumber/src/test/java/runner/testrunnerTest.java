package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "src/test/resources/feature",
		glue="stepdefinition",
		tags="@test"
		)

public class testrunnerTest extends AbstractTestNGCucumberTests{

}
