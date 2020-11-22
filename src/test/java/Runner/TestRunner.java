package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "json:tes-output/cucumber.json","html:test-output/" },
		
		features = { "features/" }, 
		glue = "stepdefinitions/", 
		tags = "@regression")

public class TestRunner {
}

