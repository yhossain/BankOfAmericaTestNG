package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {       // 1st class

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName,String url) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
				
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	        
		    driver=new ChromeDriver();
		
		}
		    
	driver.get(url);
	return driver;
	
	}	
}
