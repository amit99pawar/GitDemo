package seleniumframwork.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import seleniumframework.AbstractCompnents.AbstractCompnents;

public class Cart extends AbstractCompnents{
	
	WebDriver driver;
	
	public Cart(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="[routerlink*='cart']")
	WebElement cart;
	
	@FindBy(css=".cartSection h3")
	List<WebElement> cartProducts;
	
	@FindBy(css=".totalRow button")
	WebElement totalRowbtn;
	
	public List<WebElement> getCartProducts()
	{
		return cartProducts;
	}

	public void moveToCart(String productName){
		cart.click();
		Boolean match = getCartProducts().stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(match);
		totalRowbtn.click();
	}
	
}
