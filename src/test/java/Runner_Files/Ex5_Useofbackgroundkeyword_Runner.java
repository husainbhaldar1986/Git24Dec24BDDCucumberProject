package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex5_UseofBackGroundKeyword.feature"},
		glue = {"Steps"}
		
		)

public class Ex5_Useofbackgroundkeyword_Runner extends AbstractTestNGCucumberTests
{

}
