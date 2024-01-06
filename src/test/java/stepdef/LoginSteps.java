package stepdef;

import static org.junit.Assert.assertTrue;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.*;


public class LoginSteps {
	
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("User is On Login Page")
	public void User_Launch_Login_URL(){
    	assertTrue(loginPage.Enter_URL());
	}
    
	@When("User Enter Credentials And Login")
	public void User_Enter_Credentials_And_Login(){
		assertTrue(loginPage.User_Login());
	}
	
	@Then("User Should Logout")
	public void User_Should_Logout(){
		System.out.println("User Should Logout");
	}

    

}
