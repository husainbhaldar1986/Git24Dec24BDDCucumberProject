Feature: Login features of Swag Lab

Scenario: Login with Valid Credentials

Given User is on login page

When User enter username
When User enter password
When User click on Login button

Then User should be on Home Page

 Scenario: Verify Title
 When Verify title of page
 Then User should get title

  Scenario: Verify Profile Title
 When Click on profile tab
 Then Validate profile name
 
   Scenario: Logout from page
 When Click on Logout button
 Then User logged out from app