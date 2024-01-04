package stepdef;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.*;


public class LoginSteps {
	
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("User is On Login Page")
	public void User_Launch_Login_URL(){
    	loginPage.Enter_URL();
		System.out.println("URL Launched");
	}
	@When("User Enter Credentials")
	public void User_Enter_Credentials(){
		loginPage.Enter_Credential_And_Login();
		System.out.println("User Enter Credentials");
	}
	@Then("User Should Land On Home Page")
	public void User_Should_Land_On_Home_Page(){
		System.out.println("User Should Land On Home Page");
	}
	@Then("User Should Logout")
	public void User_Should_Logout(){
		System.out.println("User Should Logout");
	}

    

}
