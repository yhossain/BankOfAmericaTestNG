package util;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {

	static WebDriver driver;
	
public static WebDriver startBrowser(String browserName, String url) {
	
	if(browserName.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	}
	
	driver.get(url);
	return driver;
}

}
	
	
	
	
	
	
	

