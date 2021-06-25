package stepdef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import base.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class CRMStepdef extends BaseTest{

	HomePage homepage;
	LoginPage loginpage;
	
	@Given("Launch the url")
	public void launch_the_url() {
		initialize();
	}

	@When("Enter credentials")
	public void enter_credentials(DataTable datatable) {
		loginpage=new LoginPage();
		List<Map<String,String>> userDetails=datatable.asMaps();
		System.out.println(userDetails.get(0).get("uname"));
		loginpage.Login(userDetails.get(0).get("uname"), userDetails.get(0).get("pwd"));
	}
	
	@Then("User in Home page")
	public void user_in_home_page() {
		homepage=new HomePage();
		boolean isvalid=homepage.LoggedinUser();
		Assert.assertTrue(isvalid);
	}


	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	}
	
}
