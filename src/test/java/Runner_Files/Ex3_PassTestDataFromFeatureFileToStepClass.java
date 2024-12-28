package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex3_PassTestDataFromFeaturFileToStepClass.feature"},
		glue = {"Steps"}
		)


public class Ex3_PassTestDataFromFeatureFileToStepClass extends AbstractTestNGCucumberTests
{

}
