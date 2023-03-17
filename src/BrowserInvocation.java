import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserInvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods

		// Chrome

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Firefox
//		System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");
//		WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge
//		System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
//		WebDriver driver2 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		Select opt = new Select(driver.findElement(By.id("dropdown-class-example")));
		opt.selectByIndex(2);
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("name")).sendKeys("Amit Pawar");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		
		
//	    driver.close();
//		driver.quit();	
	}
}
