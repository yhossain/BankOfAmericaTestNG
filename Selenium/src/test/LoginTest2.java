package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {

	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver","c:\\auto\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		
		driver.findElement(By.id("user_login")).sendKeys("admin");
		
		driver.findElement(By.id("user_pass")).sendKeys("demo123");

		driver.findElement(By.id("wp-submit")).click();
	
		driver.findElement(By.id("title")).isDisplayed();

        driver.findElement(By.id("save-post")).isDisplayed();
		
		
		driver.close();
		
		driver.quit();
		
}
}