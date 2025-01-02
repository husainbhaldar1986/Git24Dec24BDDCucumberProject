package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex2_MultipleScenariosInSingleFeatureFile.feature"},
		glue = {"Steps"},
		publish = true,
			plugin = {"pretty", "html:ExecutionReportsCucumber/Report.html"}
		
		)

public class Ex14_GenerateReportRunner extends AbstractTestNGCucumberTests
{

}
