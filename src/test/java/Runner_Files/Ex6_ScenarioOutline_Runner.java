package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex6_ScenarioOutline.feature"},
		glue = {"Steps"}
		
		)

public class Ex6_ScenarioOutline_Runner extends AbstractTestNGCucumberTests
{

}
