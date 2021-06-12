package Org.kjh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class1 {
	
	public static WebDriver driver;
	@Test(dataProvider = "demo")
	private void tsetCase(String Username, String Password) {
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nikhi\\test//chromedriver.exe" );
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys(Username);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(Password);
		
		driver.quit();
	}
	@DataProvider(name = "demo")
	public Object[][] data() {
		
		return new Object[][] {
			{"username1", "pass1"}, {"username2", "pass2"}
		
		};
	}
	
	
		

}
