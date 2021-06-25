package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class LoginPage extends BaseTest{

	@FindBy(name="email")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement login;
	
	@FindBy(linkText="Forgot your password?")
	WebElement FYP;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String struname,String strpwd) {
		uname.sendKeys(struname);
		pwd.sendKeys(strpwd);
		login.click();
	}
	
	public void forgetpwd() {
		FYP.click();
	}
}
