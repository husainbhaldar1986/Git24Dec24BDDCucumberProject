Feature: Login features of Swag Lab

Scenario: Login with Valid Credentials

Given User is on login page

When User enter username
When User enter password
When User click on Login button

Then User should be on Home Page

