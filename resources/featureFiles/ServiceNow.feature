@ServiceNow
Feature: Check the availability of Purchase To Pay

Scenario: Check the availability of Purchase To Pay
	Given I am on celonis cloud login page 
	And I Login with valid credentials
	And I check the availability of Service Now Ticketing
	