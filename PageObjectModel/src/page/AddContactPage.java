package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {   // identify all text box elements with using ID then make function
                                // that fillingUpAddressForm to fill up all the information on the form
	WebDriver driver;
	
public AddContactPage(WebDriver ldriver) {     //construtor
		
		this.driver=ldriver;    //"this" means this page
		}
	
@FindBy(how=How.ID,using="account")
WebElement FullName;

@FindBy(how=How.ID,using="company")
WebElement Company;

@FindBy(how=How.ID,using="email")
WebElement Email;

@FindBy(how=How.ID,using="phone")
WebElement Phone;

@FindBy(how=How.ID,using="address")
WebElement Address;

@FindBy(how=How.ID,using="select2-country-container")
WebElement Country;

@FindBy(how=How.XPATH,using="html/body/span/span/span[1]/input")
WebElement CountryTextbox;


@FindBy(how=How.ID,using="city")
WebElement City;

@FindBy(how=How.ID,using="state")
WebElement State;

@FindBy(how=How.ID,using="zip")
WebElement Zip;

@FindBy(how=How.ID,using="submit")
WebElement Submit ;

public void FillinUpAddressForm() {
	
	FullName.sendKeys("Yasmin Hossain");
	Company.sendKeys("Nokia");
	Email.sendKeys("ysultana30@gmail.com");
	Phone.sendKeys("8177031159");
	Address.sendKeys("11704 crystal falls drive");
	City.sendKeys("keller");
	State.sendKeys("tx");
	Zip.sendKeys("76244");
	
	
	Country.click();
	CountryTextbox.sendKeys("iceland");
	CountryTextbox.sendKeys(Keys.ENTER);
	Submit.click();
	
}


	
}
	
	
	
	
	
	
	
	
	
	
	

