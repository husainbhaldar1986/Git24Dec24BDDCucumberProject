package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex4_ProfileTesting.feature"},
		glue = {"Steps"}
		
		)

public class Ex4_ProfileSteps_Runner extends AbstractTestNGCucumberTests
{

}
