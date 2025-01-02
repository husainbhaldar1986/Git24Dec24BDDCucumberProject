package Module1_Login;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage 
{
	//1. delcr
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logoText;
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement openMenuButton;
	@FindBy(xpath = "//a[@id='item_2_title_link']") private WebElement productNameOneSie;
	@FindBy(xpath = "(//div[@class='inventory_item_price'])[5]") private WebElement productPrice;
	@FindBy(xpath = "//div[@class='inventory_item_price']") private List<WebElement> allproductPrice;
	@FindBy(xpath = "//div[@class='inventory_item_name ']") private List<WebElement> productSizeCount;
	@FindBy(xpath = "//div[@class='inventory_item_name ']") private List<WebElement> allproductName;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addtoCartBackPack;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement shoppngCart;

	//2 init

	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3 action

	public void openMenu()
	{
		openMenuButton.click();
	}

	//	public void verfifyLogoText(String expText) 
	//	{
	//		String actText = logoText.getText();
	//		//String expText = "Swag Labs";   // called from excel
	//		if(actText.equals(expText))
	//		{
	//			System.out.println("Logo Text Correct");
	//		}
	//		else 
	//		{
	//			System.out.println("Logo Text Incorrect");
	//		}
	//	}

	public String getSwagLabsHomePageProductname()
	{
		String productname =productNameOneSie.getText();
		return productname;
	}

	public double getSwagLabsHomePageProductSinglePrice()
	{
		String ProductPrice = productPrice.getText();   // $7.99 as string
		ProductPrice = ProductPrice.substring(1);				// remove $ --> 7.99 as string
		double ProductPriceinDouble = Double.parseDouble(ProductPrice);   //convert string to double

		return ProductPriceinDouble;
	}

	public double getSwagLabsHomePageProductAllSumPrice()
	{
		double totalPrice = 0;
		for(WebElement singlePrice:allproductPrice)
		{
			String Price1 = singlePrice.getText();
			String price2 = Price1.substring(1);
			double PriceInDouble = Double.parseDouble(price2);
			totalPrice = totalPrice+PriceInDouble;
		}
		return totalPrice;
	}


	public int getSwagLabsHomePageAllProductCount()
	{
		int productCount =productSizeCount.size();
		return productCount;
	}
	
	public String getSwagLabsHomePageProductAllNames()
	{
		String Productname =" ";
		for(WebElement singleProductname:allproductName)
		{
			 Productname = singleProductname.getText();		
		}
		return Productname;
	
		
	}
	
	public void clickSwagLabsHomePageAddtocart()
	{
		addtoCartBackPack.click();
	}
	
	public void clickSwagLabsHomePageShoppingCart()
	{
		shoppngCart.click();
	}

	public String getSwagLabsHomePageLogoText()
	{
		String LogoText =logoText.getText();
		return LogoText;
	}



}
