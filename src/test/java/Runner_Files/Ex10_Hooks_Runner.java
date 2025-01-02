package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex10_Hooks.feature"},
		glue = {"Steps","Hooks"},
		//To get report
		publish = true
		)

public class Ex10_Hooks_Runner extends AbstractTestNGCucumberTests
{

}
