package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./FeatureFile/login.feature", 
		glue = "test.Cucumber.Login",
		
		dryRun = false,
		
		plugin = {"pretty", "json:Reports/cucumber/index.json"},
		
		monochrome = true
	
)

public class Runner {
	
}

