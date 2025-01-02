package Steps;

import org.testng.Assert;

import LibraryFiles.DriverFactory;
import Module1_Login.SwagLabHomePage;

import Module2_Product_Order.SwagLabProductCartPage;
import Module2_Product_Order.SwagLabProductCheckOutCompletedPage;
import Module2_Product_Order.SwagLabProductInfoPage;
import Module2_Product_Order.SwagLabProductOverviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RTE3_SwagLabOrdersStep
{
	SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);
	SwagLabProductCartPage yourCart=new SwagLabProductCartPage(DriverFactory.driver);
	SwagLabProductInfoPage checkoutInfo=new SwagLabProductInfoPage(DriverFactory.driver);
	SwagLabProductOverviewPage overview=new SwagLabProductOverviewPage(DriverFactory.driver);
	SwagLabProductCheckOutCompletedPage complete =new SwagLabProductCheckOutCompletedPage(DriverFactory.driver);
	
	@When("user click the AddToCart btn on HomePage")
	public void user_click_the_add_to_cart_btn_on_home_page() throws InterruptedException
	{
		home.clickSwagLabsHomePageAddtocart();
		Thread.sleep(1000);
	}

	@When("user click CartLink on HomePage")
	public void user_click_cart_link_on_home_page() throws InterruptedException 
	{
		home.clickSwagLabsHomePageShoppingCart();
		Thread.sleep(1000);
	}

	@When("user click Checkout btn on YourCartPage")
	public void user_click_checkout_btn_on_your_cart_page() throws InterruptedException
	{
		yourCart.clickSwagLabProductCartPageCheckOutbtn();
		Thread.sleep(1000);
	}

	@When("user enter FN as {string} on CheckoutInfoPage")
	public void user_enter_fn_as_on_checkout_info_page(String firstName)
	{
		checkoutInfo.inpSwagLabProductInfoPageFirstName(firstName);
		
	}

	@When("user enter LN as {string} on CheckoutInfoPage")
	public void user_enter_ln_as_on_checkout_info_page(String lastName) 
	{
		checkoutInfo.inpSwagLabProductInfoPageLastName(lastName);
	}

	@When("user enter Pin code as {string} on CheckoutInfoPage")
	public void user_enter_pin_code_as_on_checkout_info_page(String pinCode) throws InterruptedException 
	{
		checkoutInfo.inpSwagLabProductInfoPagePostalCode(pinCode);
		Thread.sleep(1000);
	}

	@When("user click the continue btn on CheckoutInfoPage")
	public void user_click_the_continue_btn_on_checkout_info_page() throws InterruptedException 
	{
		checkoutInfo.clickSwagLabProductInfoPagecontinueBtn();
		Thread.sleep(1000);
	}

	@When("user click FinishBtn on CheckoutOverviewPage")
	public void user_click_finish_btn_on_checkout_overview_page() throws InterruptedException 
	{
		overview.clickSwagLabProductOverviewPagefinishBtn();
		Thread.sleep(1000);
	}

	@Then("User should reach the OrderCompletePage with message {string}")
	public void user_should_reach_the_order_complete_page_with_message(String expMsg) throws InterruptedException 
	{
		String actMsg=complete.getSwagLabProductCheckOutCompletedPageDispatchMsg();
		Assert.assertEquals(actMsg, expMsg);
		Thread.sleep(1000);
	}

}
