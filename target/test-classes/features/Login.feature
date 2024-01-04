
Feature: Login Page Cases

Scenario: Login Validate Credentials
  Given User is On Login Page
	When User Enter Credentials
	Then User Should Land On Home Page
	Then User Should Logout
	