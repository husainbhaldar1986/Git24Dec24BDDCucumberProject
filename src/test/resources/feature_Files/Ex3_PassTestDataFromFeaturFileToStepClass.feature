Feature: Login features of Swag Lab

Scenario: Login with Valid Credentials
Given User is on login page
When user enter username "abc5"
And user enter password "xyz1"
And user enter pin 12345
And user click on login btn

Then User should be on Home Page
