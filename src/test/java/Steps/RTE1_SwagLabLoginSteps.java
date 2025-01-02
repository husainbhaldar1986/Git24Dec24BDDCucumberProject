package Steps;

import java.io.IOException;

import org.testng.Assert;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import Module1_Login.SwagLabHomePage;
import Module1_Login.SwagLabLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RTE1_SwagLabLoginSteps 
{
	SwagLabLoginPage login = new SwagLabLoginPage(DriverFactory.driver);
	SwagLabHomePage home = new SwagLabHomePage(DriverFactory.driver);
	
	
	@Given("user is on login")
	public void user_is_on_login() throws IOException, InterruptedException 
	{
		DriverFactory.driver.get(UtilityClass.getPFData("URL"));
		Thread.sleep(1000);
	}

	@When("user enter username on swaglab login page {string}")
	public void user_enter_username_on_swaglab_login_page(String string) throws InterruptedException 
	{
	    login.inpSwagLabLoginPageUsername(string);
	    Thread.sleep(1000);
	}

	@When("user enter password on swaglab login page {string}")
	public void user_enter_password_on_swaglab_login_page(String string) throws InterruptedException 
	{
	    login.inpSwagLabLoginPagePassword(string);
	    Thread.sleep(1000);
	}

	@When("user click on login btn swaglab login page")
	public void user_click_on_login_btn_swaglab_login_page() throws InterruptedException 
	{
	   login.clickSwagLabLoginPageLoginButton();
	   Thread.sleep(1000);
	}

	@Then("user should be at SwagLab home page with logo {string}")
	public void user_should_be_at_swag_lab_home_page_with_logo(String string)
	{
		 String actLogotext = home.getSwagLabsHomePageLogoText();
		 Assert.assertEquals(actLogotext, string, "Failed:Both text are diff");
	    
	}

}
