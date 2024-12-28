package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex1_LoginToSwagLab 
{
	@Given("User is on login page")
	public void user_is_on_login_page()
	{
		System.out.println("Login page");
	}

	@When("User enter username")
	public void user_enter_username() 
	{
		System.out.println("Enter User Name");
	}

	@When("User enter password")
	public void user_enter_password() 
	{
		System.out.println("Enter Password");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() 
	{
		System.out.println("Click on Login Button");
	}

	@Then("User should be on Home Page")
	public void user_should_be_on_home_page()
	{
		System.out.println("-------On Home Page--------");
	}


	@Then("title of the app should be visible")
	public void title_of_the_app_should_be_visible()
	{
		System.out.println("------title of the app should be visible--------");
	}

	@When("user click on forgotten pwd link")
	public void user_click_on_forgotten_pwd_link() 
	{
		System.out.println("Click on forgotten PWD link");
	}

	@Then("title of the forgotten pwd page should be visible")
	public void title_of_the_forgotten_pwd_page_should_be_visible()
	{
		System.out.println("-----Title of the forgotten pwd page should be visible-----------");
	}

	@When("user enter username {string}")
	public void user_enter_username(String string)
	{
	    System.out.println("User Enter username: "+string);
	}

	@When("user enter password {string}")
	public void user_enter_password(String string) 
	{
	   System.out.println("User Enter Password: "+string);
	}

	@When("user enter pin {int}")
	public void user_enter_pin(Integer int1) 
	{
	   System.out.println("Enter Pin: "+int1);
	}

	@When("user click on login btn")
	public void user_click_on_login_btn() 
	{
	    System.out.println("Click Login Btn");
	}




}
