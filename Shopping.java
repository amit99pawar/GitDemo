package POMPractive.PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPractive.Pages.AbstractComponents;
import POMPractive.Pages.LoginPage;
import POMPractive.Pages.ProductsAdd;

public class Shopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AbstractComponents AbstractComp = new AbstractComponents(driver);
		AbstractComp.implicitWait();
		driver.get("https://rahulshettyacademy.com/client/");
		LoginPage LogPage = new LoginPage(driver);
		LogPage.windowmax();
		LogPage.loginapplication("anshika@gmail.com", "Iamking@000");
		driver.findElement(By.id("login")).click();
		ProductsAdd Padd = new ProductsAdd(driver);
		Padd.AddCart();
		
	}

}
