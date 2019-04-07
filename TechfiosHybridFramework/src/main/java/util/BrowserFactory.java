package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {  //First class

	
static WebDriver driver;   //global variable so webdriver can be used through out of the class

	
	public static WebDriver startBrowser(String browserName,String url) { 
		
		if(browserName.equalsIgnoreCase("chrome")) {
		
			
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe"); // "\\" means to what comes before that we're counting that
			
			//opens the browser
			driver= new ChromeDriver();
		}
		//goes to the url
				driver.get(url);
		
		//returns the driver value in the function so it can use for the next step.
				return driver;  // we need to return the driver so we can use it the next step
				
		
	}	
	}
	
	
	

