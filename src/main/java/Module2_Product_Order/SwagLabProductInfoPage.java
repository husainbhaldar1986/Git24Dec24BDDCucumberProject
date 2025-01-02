package Module2_Product_Order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabProductInfoPage 
{
//1 declr
	@FindBy(xpath="//input[@id='first-name']") private WebElement firstName;
	@FindBy(xpath ="//input[@id='last-name']") private WebElement lastName;
	@FindBy(xpath = "//input[@id='postal-code']") private WebElement postalCode;
	@FindBy(xpath = "//input[@id='continue']") private WebElement continueBtn;
//2 init
	public SwagLabProductInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver =driver;
	}
	
	//3a action
	public void inpSwagLabProductInfoPageFirstName(String firstN)
	{
		firstName.sendKeys(firstN);	
	}
	public void inpSwagLabProductInfoPageLastName(String lastN)
	{
		lastName.sendKeys(lastN);	
	}
	public void inpSwagLabProductInfoPagePostalCode(String postalCod)
	{
		postalCode.sendKeys(postalCod);	
	}
	public void clickSwagLabProductInfoPagecontinueBtn()
	{
		continueBtn.click();	
	}
	

}
