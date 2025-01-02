package Steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex4_DataTableSteps 
{
	//Use cntrl + shift + o  to import all lib
	@Given("user should be on account opening page")
	public void user_should_be_on_account_opening_page() 
	{
	    System.out.println("Account opening page");
	}
//1. Using List get data from table
	
//	@When("user enters below data")
//	public void user_enters_below_data(DataTable dt) 
//	{
//	 List<List<String>> data = dt.asLists();
//	String value = data.get(2).get(1);   // 2nd row 1 col value
//	System.out.println(value);
//	
//	System.out.println("---1st row------");
//	System.out.println(data.get(1).get(0));
//	System.out.println(data.get(1).get(1));
//	System.out.println(data.get(1).get(2));
//	System.out.println(data.get(1).get(3));
//	
//	//Get 3rd row data
//	System.out.println("---3rd row------");
//	System.out.println(data.get(3).get(0));
//	System.out.println(data.get(3).get(1));
//	System.out.println(data.get(3).get(2));
//	System.out.println(data.get(3).get(3));
//	
//	}
	
	//2. Using Map get data from table
	@When("user enters below data")
	public void user_enters_below_data(DataTable dt) 
	{
	  List<Map<String, String>> data = dt.asMaps();
	 
	String value = data.get(1).get("FN");   
	System.out.println(value);
	
	System.out.println(data.get(1).get("LN"));
	System.out.println(data.get(1).get("Mail Id"));
	System.out.println(data.get(1).get("Mobile Number"));
	
	System.out.println(data.get(0).get("FN"));
	System.out.println(data.get(0).get("LN"));
	System.out.println(data.get(0).get("Mail Id"));
	System.out.println(data.get(0).get("Mobile Number"));
	}

	@When("user click on submit btn")
	public void user_click_on_submit_btn() 
	{
	  System.out.println("Click submit button");
	}

	@Then("user get created")
	public void user_get_created() 
	{
	    System.out.println("-----User get created-----------");
	}


}
