package RTE_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\FeatureFiles_RTE\\RTE3_SwagLabOrder.feature"},
		glue = {"Steps","RTEHooks"},
		publish = true,
		plugin = {"pretty","html:ExecutionReports/SwagLabOrder.html"}
		
		)

public class RTE3_SwagLabOrder_Runner extends AbstractTestNGCucumberTests
{

}
