package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex9_DataTable.feature"},
		glue = {"Steps"},
		//To get report
		publish = true
		)

public class Ex9_DataTable_Runner extends AbstractTestNGCucumberTests
{

}
