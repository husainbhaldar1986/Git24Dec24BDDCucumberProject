package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex8_ScenarioOutline_withBackgroundKeyword.feature"},
		glue = {"Steps"}
		
		)

public class Ex8_ScenarioOutline_withBackGroundKeyword_Runner extends AbstractTestNGCucumberTests
{

}
