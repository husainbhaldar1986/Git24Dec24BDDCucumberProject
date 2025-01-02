@Positive 

Feature: Login features of Swag Lab

@Smoke
Scenario: Login with Valid Credentials
Given User is on login page
When User enter username
When User enter password
When User click on Login button

Then User should be on Home Page

@Sanity
Scenario: verify title of the app
Given User is on login page
Then title of the app should be visible

@Regression
Scenario: verify title of the forgotten pwd page
Given User is on login page
When user click on forgotten pwd link
Then title of the forgotten pwd page should be visible



