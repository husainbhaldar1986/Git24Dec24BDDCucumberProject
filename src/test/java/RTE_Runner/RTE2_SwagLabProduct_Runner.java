package RTE_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\FeatureFiles_RTE\\RTE2_SwagLabProdcut.feature"},
		glue = {"Steps","RTEHooks"},
		publish = true,
		plugin = {"pretty","html:ExecutionReports/SwagLabProduct.html"}
		
		)

public class RTE2_SwagLabProduct_Runner extends AbstractTestNGCucumberTests
{

}
