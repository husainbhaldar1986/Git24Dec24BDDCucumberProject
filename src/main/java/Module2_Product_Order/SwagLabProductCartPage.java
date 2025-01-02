package Module2_Product_Order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabProductCartPage 
{
//1 declr
	@FindBy(xpath="//button[@id='checkout']") private WebElement CheckOutBtn;
	
	
//2 init
	public SwagLabProductCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver =driver;
	}
	
	//3a action
	public void clickSwagLabProductCartPageCheckOutbtn()
	{
		CheckOutBtn.click();	
	}
	
}
