package seleniumframwork.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumframework.AbstractCompnents.AbstractCompnents;

public class Payment extends AbstractCompnents {
	
	WebDriver driver;
	
	public Payment(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement country;
	
	@FindBy(xpath="//div[@class='ta-backdrop']")
	WebElement submit;
	
	@FindBy(xpath="//div[@class='payment__shipping']//button[2]")
	WebElement dropdownopt;
	
	By Dropdnsel = By.xpath("//div[@class='payment__shipping']//button[2]");
	
	public void placeOrder() {
		actions(country);
		waitForElementToAppear(Dropdnsel);
		dropdownopt.click();
		submit.click();
	}
	
	
	

}
