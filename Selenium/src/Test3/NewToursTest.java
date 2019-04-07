package Test3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursTest {

	
	@Test
	public void ToursTest() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\auto\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
	//maximize your screen
		
		 //driver.manage().window().maximize();
		
		 driver.get("http://newtours.demoaut.com/");
		
	//identify using name locator
		
		 //driver.findElement(By.name("userName")).sendKeys("TomG");
	
		 //driver.findElement(By.name("password")).sendKeys("Password1234");
	
	//example of relative xpath
		 
		 driver.findElement(By.xpath(".//input[contains(@name,'user')]")).sendKeys("Tomg");
		 
	//identify using classname (ignore this class technique)
		
		 driver.findElement(By.className("mouseOut")).click();
		
	//identify using link text
	
		 driver.findElement(By.linkText("SIGN-ON")).click();
		
	//example os css selector in the contact link

		 driver.findElement(By.linkText("CONTACT")).click();
		
		//driver.findElement(By.cssSelector("html body div table tbody tr td table tbody tr td table tbody tr td table tbody tr td a img")).click();
		 
		//example of absolute xpath
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		
		
		driver.close();
		
		driver.quit();
	
	
	}	
}
