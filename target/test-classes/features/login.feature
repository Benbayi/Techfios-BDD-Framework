Feature: As a user I want a login page so that only authentic
	Users will be able to login
	
	Scenario: Valid users should be able to login
	Given a valid user
	When user goes to Techfios site
	Then login page should be displayed
	When user logs with valid credentials
	Then dashboard page should display