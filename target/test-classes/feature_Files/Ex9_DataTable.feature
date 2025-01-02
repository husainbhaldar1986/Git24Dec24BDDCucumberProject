Feature: Bank Account Creation

Scenario: Opening Account with Nominee Info

Given user should be on account opening page

When user enters below data
|  FN   | LN   | Mail Id        |  Mobile Number |
|  abc1 | xyz1 | abc1@gmail.com |  9999999999    |
|  abc2 | xyz2 | abc2@gmail.com |  8899999988    |
|  abc3 | xyz3 | abc3@gmail.com |  7799999977    |

And user click on submit btn

Then user get created 