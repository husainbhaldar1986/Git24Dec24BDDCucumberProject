package RTEHooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SwagLabHooks 
{
	WebDriver driver;
	
	@Before
	public void openBrowser() throws IOException
	{
		 driver = DriverFactory.initializeBrowser(UtilityClass.getPFData("browserName"));
	}
	
	
	@After
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}

}
