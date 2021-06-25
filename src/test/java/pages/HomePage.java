package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class HomePage extends BaseTest{

	@FindBy(xpath="//span[@class='user-display']")
	WebElement Loggername;
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contact;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean LoggedinUser() {
		return Loggername.isDisplayed();
	}
	public void clickcontact() {
		contact.click();
	}
}
