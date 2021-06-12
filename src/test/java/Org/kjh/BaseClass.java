package Org.kjh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	
	@BeforeClass
	private void beforeClass(){
		System.out.println("beforeclass");
	}
	public static WebDriver driver;
	@BeforeMethod
	private void beforeMethod(){
		System.out.println("beforeMethod");
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nikhi\\test//chromedriver.exe" );
				
				 driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
	}
	
	@Test
	private void tsetCase() {
		System.out.println("hello");
WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("Nikhil");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("vnr@1234");
		
		WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		login.click();
		
		
	}
	@AfterMethod
	
	private void afterMethod() throws InterruptedException{
		System.out.println("afterMethod");
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	@AfterClass
	private void afterClass(){
		System.out.println("afterClass");
		driver.quit();
	}

}
