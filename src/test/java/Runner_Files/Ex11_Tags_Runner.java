
package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\Admin\\eclipse-workspace\\Cucumber24Dec24\\src\\test\\resources\\feature_Files\\Ex11_Tags.feature"},
		glue = {"Steps","Hooks"},
		//tags= "@Smoke",
		//tags= "@Smoke or @Sanity",
		//tags= "@Smoke and @Positive",
		tags= "not @Smoke",
		//To get report
		publish = true
		)

public class Ex11_Tags_Runner extends AbstractTestNGCucumberTests
{

}
