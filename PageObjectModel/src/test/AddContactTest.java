package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddContactPage;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {   // calling the function that i created

	@Test
	public void AddingContactIformation() throws InterruptedException {    
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");	
		
	LoginPage login=PageFactory.initElements(driver, LoginPage.class);		
	
	login.LoginTechFios();   // 1 no. function
	
	HomePage home = PageFactory.initElements(driver, HomePage.class);
	
	home.ClickAddContact();   // 2 no. function
	
	AddContactPage contact = PageFactory.initElements(driver, AddContactPage.class);
	
	contact.FillinUpAddressForm();    // 3 no.function
	
	driver.close();
	
	driver.quit();
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
