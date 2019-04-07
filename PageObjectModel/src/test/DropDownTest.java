package test;



import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import page.LoginPage;
import page.MercuryPage;
import util.BrowserFactory;

public class DropDownTest{
	
	@Test

	public void MercuryDropDown() {
		
	
	WebDriver driver= BrowserFactory.startBrowser("chrome","http://demo.guru99.com/test/newtours/register.php");
	
	Select dropdown = new Select(driver.findElement(By.name("country")));
	dropdown.selectByVisibleText("BAHAMAS");
	
	}
	@Test

	public void MercuryDropDownPageObject() {
		
	
	WebDriver driver= BrowserFactory.startBrowser("chrome","http://demo.guru99.com/test/newtours/register.php");
	


	MercuryPage country=PageFactory.initElements(driver, MercuryPage.class);
	country.selectCountry("BAHAMAS");
	
	}	
	
	
	
	@Test    // BootStrapDropDown
	public void BootstrapDropDownPageObject() {
		
	
	WebDriver driver= BrowserFactory.startBrowser("chrome","http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	
    driver.findElement(By.xpath(".//*[@id='menu1']")).click();
    
    List<WebElement> list = driver.findElements(By.xpath(".//*[@id='post-body-4615304122771162527']/div[1]/div/ul"));

	for(int i=0 ;i<list.size(); i++)
	
	{
	
		
		WebElement element = list.get(i);
		
		String innerhtml = element.getAttribute("innerHTML");
		
		if (innerhtml.contentEquals("CSS"));
		
		{
			element.click();
			break;
		}
		
	}
	}
	
	                              //webtable
	@Test
	public void Webtable() {
		
		WebDriver driver= BrowserFactory.startBrowser("chrome","http://demo.guru99.com/test/newtours/index.php");
		MercuryPage table=PageFactory.initElements(driver, MercuryPage.class);
		table.VerifyAmmount();
	}
	
	@Test                       //switching Iframe
	public void Iframe() {
		
		WebDriver driver= BrowserFactory.startBrowser("chrome", "https://www.dezlearn.com/testingpage/");
		driver.switchTo().frame("contact-iframe");
		
		driver.findElement(By.id("ninja_forms_field_11")).sendKeys("John");
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("popup")).click();
		
		driver.close();
		
	}			
				
	@Test
	public void hover() {
		WebDriver driver= BrowserFactory.startBrowser("chrome", "https://www.dezlearn.com/testingpage/");
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		login.LoginTechFios();
	
	}
				
				
				
				
				
				
				
				
	
}
