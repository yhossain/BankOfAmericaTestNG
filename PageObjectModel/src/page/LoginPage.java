package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {    //third class made ( testcase wrote  in loginpage )

	WebDriver driver;
	
	//pupose of this construtor is to tell the driver to initiate this class
	
	public LoginPage(WebDriver ldriver) {     //construtor
	
	this.driver=ldriver;    //"this" means this page
	}
	
	//identifying the values
	
	
	//WebElement is equal to ID = username
	@FindBy(how=How.ID,using="username")
	WebElement username;
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@FindBy(how=How.NAME,using="login")
	WebElement LoginButton;
	
	
	//make functions with the variables.

	public void LoginTechFios() {     //non static function
		
	
	username.sendKeys("techfiosdemo@gmail.com");
	password.sendKeys("abc123");
	LoginButton.click();
	
	
	
	
	
	}	
}
