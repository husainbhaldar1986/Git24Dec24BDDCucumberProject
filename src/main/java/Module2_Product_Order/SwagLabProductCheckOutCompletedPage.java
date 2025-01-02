package Module2_Product_Order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabProductCheckOutCompletedPage 
{
//1 declr
	@FindBy(xpath="//div[@class='complete-text']") private WebElement orderDispatchMsg;


//2 init
	public SwagLabProductCheckOutCompletedPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver =driver;
	}
	
	//3a action
	public String getSwagLabProductCheckOutCompletedPageDispatchMsg()
	{
		String DispatchMsg= orderDispatchMsg.getText();
		return DispatchMsg ;
	}
}
