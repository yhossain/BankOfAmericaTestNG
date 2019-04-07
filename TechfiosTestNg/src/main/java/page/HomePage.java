package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

WebDriver driver;
	
	public HomePage(WebDriver ldriver) {     //construtor
		
		this.driver=ldriver;  //"this" means this page
		
		}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'CRM')]")                                                                              
	WebElement CRM;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Add Contact')]")
	WebElement AddContact;
	
	@FindBy(how=How.NAME,using="name")
	WebElement SearchCustomer;
	
	public void NavigatingToAddContact() {
		
		CRM.click();
		AddContact.click();
	}
	
	public void VerifyPageLogin() {    //making a marker to check login is working
		
		CRM.isDisplayed();  // is Displayed means if a element is visible or not
		SearchCustomer.isDisplayed();
		
	}
	
	
	
	
	
	
}
