package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex7_ScenarioOutline_WithScenaios_Mix.feature"},
		glue = {"Steps"}
		
		)

public class Ex7_ScenarioOutline_withScenarios_Runner extends AbstractTestNGCucumberTests
{

}
