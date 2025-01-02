package Module2_Product_Order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabProductOverviewPage 
{
//1 declr
	@FindBy(xpath="//button[@id='finish']") private WebElement finishBtn;


//2 init
	public SwagLabProductOverviewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver =driver;
	}
	
	//3a action
	
	public void clickSwagLabProductOverviewPagefinishBtn()
	{
		finishBtn.click();	
	}
}
