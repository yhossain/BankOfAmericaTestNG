package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {    // first this class made

	static WebDriver driver;   //global variable so webdriver can be used through out of the class

	
	public static WebDriver startBrowser(String browserName,String url) { 
	
		
  //helps to open the browser with the help of WebDriver
  // webdriver is interface, startbrowser is main function that we can open all web page
		
		
		//logic for opening the chrome driver
		if(browserName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe"); // "\\" means to what comes before that we're counting that
			
			
			//opens the browser
			driver= new ChromeDriver();
		}
		
		
		//goes to the url
		driver.get(url);
		
		
		//returns the driver value in the function so it can use for the next step.
		return driver;  // we need to return the driver so we can use it the next step
		
		
		
		
		
		
		
		
		
}
}