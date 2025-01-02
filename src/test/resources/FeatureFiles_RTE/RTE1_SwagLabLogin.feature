Feature: swaglab login feature

Scenario: login with valid credentials
Given user is on login
When user enter username on swaglab login page "standard_user"
And user enter password on swaglab login page "secret_sauce"
And user click on login btn swaglab login page
Then user should be at SwagLab home page with logo "Swag Labs"