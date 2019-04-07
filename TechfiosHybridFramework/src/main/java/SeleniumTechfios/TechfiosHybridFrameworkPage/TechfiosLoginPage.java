package SeleniumTechfios.TechfiosHybridFrameworkPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosLoginPage {    // 2nd class

WebDriver driver;
	
	//pupose of this construtor is to tell the driver to initiate this class
	
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
		
		//make functions with the variables.

		public void TechfiosLogin() {     //non static function
			
		
		Email.sendKeys("techfiosdemo@gmail.com");
		Password.sendKeys("abc123");
		Signinbutton.click();
		
		
	
		}

		
			
		}
	
         
	
	
	
	
	
	

