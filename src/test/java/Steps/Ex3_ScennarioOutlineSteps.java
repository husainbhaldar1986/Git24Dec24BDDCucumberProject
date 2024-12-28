package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex3_ScennarioOutlineSteps

{
	@Given("user is at signup page")
	public void user_is_at_signup_page()
	{
		System.out.println("signup page");
	}

	@When("user enters name as {string} inside form")
	public void user_enters_name_as_inside_form(String string) 
	{
		System.out.println("Enter Name: "+ string);
	}

	@When("user enters age as {int}")
	public void user_enters_age_as(Integer int1)
	{
		System.out.println("Enter Age: "+ int1);
	}

	@When("user confirm gender as {string}")
	public void user_confirm_gender_as(String string)
	{
		System.out.println("Gender: "+ string);
	}

	@Then("user gets created")
	public void user_gets_created()
	{
		System.out.println("-----User Created---");
	}
	


	@Then("url should contain {string}")
	public void url_should_contain(String string) 
	{
		System.out.println("-----url: ---"+string);
	}
	

}
