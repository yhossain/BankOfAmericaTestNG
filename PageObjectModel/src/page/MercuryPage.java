package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MercuryPage {   //DROPDOWN in PAGE OBJECT MODEL

	
WebDriver driver;
	
	//Purpose of this constructor is to tell the driver to initiate this class
	
	public MercuryPage(WebDriver ldriver) {     //Constructor
	
	this.driver=ldriver;    //"this" means this page
	}
	
	@FindBy(how=How.NAME,using="country")                                                                              
	WebElement CountryDropDown;
	
	                       // webtable
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/div/font/b")                                                                              
	WebElement Firstrow;
	
	
	
	
	public Select getSelectedOptions() {	
	return new Select(CountryDropDown);
	}
	
	public void selectCountry(String value) {
		
	getSelectedOptions().selectByVisibleText(value);// use the value or index number
		
		//or
		
	//getSelectedOptions().selectByIndex(15);
	
	
	}
	      //webtable
	public void VerifyAmmount() {
		
	Assert.assertEquals("$398", Firstrow.getText());
	}
	
	
	
	
	
	
	
}
