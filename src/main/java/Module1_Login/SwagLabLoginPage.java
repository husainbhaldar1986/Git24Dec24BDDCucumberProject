package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
//1 declr
	@FindBy(xpath="//input[@name='user-name']") private WebElement UN;
	@FindBy(xpath ="//input[@name='password']") private WebElement PWD;
	@FindBy(xpath = "//input[@name='login-button']") private WebElement loginBtn;
	@FindBy(xpath = "//button[@class='error-button']") private WebElement errorMsgInvalidPWD;
//2 init
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver =driver;
	}
	
	//3a action
	public void inpSwagLabLoginPageUsername(String useranme)
	{
	UN.sendKeys(useranme);	
	}
	public void inpSwagLabLoginPagePassword(String password)
	{
	PWD.sendKeys(password);	
	}
	public void clickSwagLabLoginPageLoginButton()
	{
	loginBtn.click();	
	}
	public void clearPWD()
	{
		PWD.clear();
	}
	public void VerifySwagLabLoginPageErrorMsg(String expError)
	{
	String actError = errorMsgInvalidPWD.getText();
	if(actError.equals(expError))
	{
		System.out.println("Login failed");
	}
	else
	{
		System.out.println("Login successful");
	}
		
		
	}
}
