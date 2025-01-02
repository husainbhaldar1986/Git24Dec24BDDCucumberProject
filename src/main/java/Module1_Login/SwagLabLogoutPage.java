package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLogoutPage
{
	//step1. delcr var
		@FindBy(xpath = "//a[text()='Logout']") private WebElement logoutButton;
		
		//step2 initil
	  public SwagLabLogoutPage(WebDriver driver)
	    {
		  PageFactory.initElements(driver,this);
	    }
	  //3 action
	  public void clickLogoutButton()
	  	{
		   	logoutButton.click();
		}
}
