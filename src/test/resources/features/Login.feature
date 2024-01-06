
Feature: Login Page Cases

Scenario: Login Validate Credentials
  Given User is On Login Page
	When User Enter Credentials And Login
	Then User Should Logout
	