package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {  // second class made
	
@Test  //test methods works similar to a static main method

	public void LoginTest() {
		
		WebDriver driver= BrowserFactory.startBrowser("chrome","http://techfios.com/test/billing/?ng=login/");
		
	
	//created the object to call the non static function
	//object is getting equal to PageFactory initElements which calling the class with the driver
		
		
	LoginPage login=PageFactory.initElements(driver, LoginPage.class);
	
		
		//PageFactory helps us which page to go. initElements help pagefactory which page we can get fuction from
	
	
	// implicit wait
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	// to pause the web for 15 seceond with thread.sleep
	
	
	//try {
		//Thread.sleep(15000);
	//} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	//}
			
		
		login.LoginTechFios();
		driver.close();
		driver.quit();
		
		
		
		
	}

}
