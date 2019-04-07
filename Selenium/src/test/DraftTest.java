package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraftTest {
	
		@Test
		public void AddingDraft() {
			
			System.setProperty("webdriver.chrome.driver","C:\\auto\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			//maximize your screen
			
			//driver.manage().window().maximize();
			
			driver.get("http://demosite.center/wordpress/wp-login.php");
			
			
			driver.findElement(By.id("user_login")).sendKeys("admin");
			
			
			driver.findElement(By.id("user_pass")).sendKeys("demo123");
	
	
			driver.findElement(By.id("wp-submit")).click();
	/*
	     //verify you made it to homepage
			
			driver.findElement(By.id("title")).isDisplayed();

			System.out.println("login works and page loaded properly");
			
			
		//for title text box
			driver.findElement(By.id("title")).sendKeys("name");
			
			
			driver.findElement(By.id("content")).sendKeys("I live in texas");
			
			
			driver.findElement(By.id("save-post")).click();
			
			*/
			driver.close();
			
			driver.quit();
			
}
}