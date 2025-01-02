Feature: Swaglab Product feature

Background:
Given user is on login
When user enter username on swaglab login page "standard_user"
And user enter password on swaglab login page "secret_sauce"
And user click on login btn swaglab login page


Scenario: S6: Purchase Any Product
When user click the AddToCart btn on HomePage
And user click CartLink on HomePage 
And user click Checkout btn on YourCartPage 
And user enter FN as "abc1" on CheckoutInfoPage
And user enter LN as "xyz1" on CheckoutInfoPage
And user enter Pin code as "12345" on CheckoutInfoPage
And user click the continue btn on CheckoutInfoPage
And user click FinishBtn on CheckoutOverviewPage
Then User should reach the OrderCompletePage with message "Your order has been dispatched, and will arrive just as fast as the pony can get there!"







