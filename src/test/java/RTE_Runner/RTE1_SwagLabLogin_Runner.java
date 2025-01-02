package RTE_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\FeatureFiles_RTE\\RTE1_SwagLabLogin.feature"},
		glue = {"Steps","RTEHooks"},
		publish = true,
		plugin = {"pretty","html:ExecutionReports/SwagLabLogin.html"}
		)

public class RTE1_SwagLabLogin_Runner extends AbstractTestNGCucumberTests
{

}
