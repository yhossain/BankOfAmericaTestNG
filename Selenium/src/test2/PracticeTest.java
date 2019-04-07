package test2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {


@Test
public void Practice(){	
	
	System.setProperty("webdriver.chrome.driver","c:\\auto\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.objectspy.com/");
	
	driver.get("https://www.objectspy.com/register/signup.php");

	driver.findElement(By.name("email")).sendKeys("ysultana30@gmail.com");
	
	driver.findElement(By.name("password")).sendKeys("abc123");

	driver.findElement(By.id("login")).click();

	driver.close();
	
	driver.quit();
	
	
	
	
	
}	
}
