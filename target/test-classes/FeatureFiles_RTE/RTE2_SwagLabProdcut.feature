Feature: Swaglab Product feature

Background:
Given user is on login
When user enter username on swaglab login page "standard_user"
And user enter password on swaglab login page "secret_sauce"
And user click on login btn swaglab login page


Scenario: S2: Verify Product Name
Then product name "Sauce Labs Onesie" should be visible on home page

Scenario: S3: verify OneSie Product Price
Then OneSie Product Price should be 7.99

Scenario: S4: verify Home Page All Product Size
Then Home Product Size should be 6

Scenario: S5: verify Product Total Price
Then Product price should be 129.94




