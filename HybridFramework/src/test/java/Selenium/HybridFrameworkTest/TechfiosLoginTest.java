package Selenium.HybridFrameworkTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Selenium.HybridFrameworkPage.TechfiosLoginPage;
import util.BrowserFactory;
import util.Xls_Reader;



public class TechfiosLoginTest {
	
	 Xls_Reader reader = new Xls_Reader("/Users/ysult/MyWorkSpace/HybridFramework/Data/TestData.xlsx");
		
		
		
		String email = reader.getCellData("Sheet1", "Email", 2);
		 
		String password =reader.getCellData("Sheet1", "Password", 2);

	@Test
	 public void Login() {
		
		//System.out.println(email);
		//System.out.println(password);
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		
		TechfiosLoginPage login = PageFactory.initElements(driver, TechfiosLoginPage.class);
		
		login.TechfiosLogin(email, password);
		
		driver.close();
		
		driver.quit();
	}
	
	
	
	
	
	
	
}
