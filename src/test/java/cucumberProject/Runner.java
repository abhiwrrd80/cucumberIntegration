package cucumberProject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@rerun/failedScenarios.txt", glue="cucumberProject",
                                                plugin="rerun:rerun/failedScenarios.txt")
public class Runner {

	
	
}
