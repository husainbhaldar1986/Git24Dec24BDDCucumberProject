package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex2_ProfileSteps
{
	@When("Verify title of page")
	public void verify_title_of_page() 
	{
	    System.out.println("Verify profile page");
	}

	@Then("User should get title")
	public void user_should_get_title()
	{
	    System.out.println("-----User get title-----");
	}

	@When("Click on profile tab")
	public void click_on_profile_tab() 
	{
	    System.out.println("click on profile tab");
	}

	@Then("Validate profile name")
	public void validate_profile_name() 
	{
		System.out.println("------Profile name validated------------");

	}

	@When("Click on Logout button")
	public void click_on_logout_button() 
	{
	    System.out.println("click on logout button");
	}

	@Then("User logged out from app")
	public void user_logged_out_from_app() 
	{
	   System.out.println("----------Logged from App-----");
	}
	
	@Then("get Title & verify")
	public void get_title_verify() 
	{
	    System.out.println("-----User get title-----");
	}

	@When("user click on profile tab")
	public void user_click_on_profile_tab() 
	{
		 System.out.println("click on profile tab");
	}

	@Then("get profile name & validate")
	public void get_profile_name_validate() 
	{
		System.out.println("------Profile name validated------------");
	}

	@When("user click on logout btn")
	public void user_click_on_logout_btn()
	{
		System.out.println("click on logout button");
	}

	@Then("logged out from app")
	public void logged_out_from_app()
	{
		 System.out.println("----------Logged from App-----");
	}

}
