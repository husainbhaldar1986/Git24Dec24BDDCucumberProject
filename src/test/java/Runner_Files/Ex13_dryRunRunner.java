package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files"},
		glue = {"Steps"},
		publish = true,
		dryRun = true
				
		)

public class Ex13_dryRunRunner extends AbstractTestNGCucumberTests
{

}
