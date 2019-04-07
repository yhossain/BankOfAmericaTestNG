package page;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {    // identify CRM & AddContact to click, then you have to make function 
                           // how to click CRM & AddContact
	WebDriver driver;
	
	public HomePage(WebDriver ldriver) {     //construtor
		
		this.driver=ldriver;  //"this" means this page
		
		}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'CRM')]")                                                                              
	WebElement CRM;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Add Contact')]")
	WebElement AddContact;
	
	public void ClickAddContact() {
		
		
	//Explicit wait	
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(CRM));
	
	
	//hovering
	Actions action = new Actions(driver);
	action.moveToElement(CRM).build().perform();
	
			
		
	CRM.click();
	AddContact.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
