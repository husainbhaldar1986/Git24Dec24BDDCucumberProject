package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\logintoSwagLabW_OTD.feature"},
		glue = {"Steps"}
		)

public class Ex1_LoginToSwagLab_Runner extends AbstractTestNGCucumberTests
{

}
