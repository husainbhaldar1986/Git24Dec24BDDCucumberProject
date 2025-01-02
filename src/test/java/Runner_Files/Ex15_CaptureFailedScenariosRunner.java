package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex2_MultipleScenariosInSingleFeatureFile.feature"},
		glue = {"Steps"},
		publish = true,
		plugin = {"rerun:target/ReRunFiles/reRun.txt"}

		
		)

public class Ex15_CaptureFailedScenariosRunner extends AbstractTestNGCucumberTests
{

}
