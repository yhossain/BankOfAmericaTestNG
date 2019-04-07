package SeleniumTechfios.TechfiosHybridFrameworkTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import SeleniumTechfios.TechfiosHybridFrameworkPage.TechfiosLoginPage;
import util.BrowserFactory;

public class TechfiosLoginTest {

	@Test  //test methods works similar to a static main method

	public  void Login() {
		
		WebDriver driver= BrowserFactory.startBrowser("chrome","http://techfios.com/test/billing/?ng=login/");
		
		//created the object to call the non static function
		//object is getting equal to PageFactory initElements which calling the class with the driver
			
		TechfiosLoginPage login = PageFactory.initElements(driver, TechfiosLoginPage.class);	
		
		
			
			//PageFactory helps us which page to go. initElements help pagefactory which page we can get fuction from
		
		
	
        login.TechfiosLogin();
        
		driver.close();
		
		driver.quit();
		
	
	
	
	
	
	
	
	
	}
	
}
