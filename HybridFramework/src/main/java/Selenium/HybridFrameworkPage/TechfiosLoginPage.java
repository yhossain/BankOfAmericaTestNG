package Selenium.HybridFrameworkPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosLoginPage {     // 2nd class
	
	WebDriver driver;
	
	public TechfiosLoginPage(WebDriver ldriver) {     //construtor
		
		this.driver=ldriver;    //"this" means this page
		}
		
	//identifying the values
	
	
		//WebElement is equal to ID = username
		@FindBy(how=How.ID,using="username")
		WebElement Email;
		
		@FindBy(how=How.ID,using="password")
		WebElement Password;
		
		@FindBy(how=How.NAME,using="login")
		WebElement Signinbutton;
		
		
		public void TechfiosLogin(String email, String password) {
			
			Email.sendKeys(email);
			Password.sendKeys(password);
			Signinbutton.click();
		}


		
			
		}
		
	
	
	
