package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
	
	//Locators
	By Email_XP = By.xpath("//*[text()='Username']");
    By Password_XP = By.xpath("//*[text()='Username']");
    
    
    //Methods
    
    public void Enter_URL() {
    	driver.get("URL");
    }
    
    public void Enter_Credential_And_Login() {
    	driver.findElement(Email_XP).sendKeys("admin");
    	driver.findElement(Password_XP).sendKeys("admin");
    }
	
}
