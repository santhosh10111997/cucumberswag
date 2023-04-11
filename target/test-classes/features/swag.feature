@a2a
Feature: User buy the product
@smoke
Scenario: User go to login page
Given user launch the url
When User fill the username
And The user fill password
And The user click the login button
@regression
Scenario: User select the products to Add to card page
When user handle the alert
And User select the products to click the add to card button 
And user go to click the add card page
@retest
Scenario: User check out the product and confirming order
When user click the checkout button
And user fill the first name 
And user fill the last name 
And user fill the postel code
And user click the continue button
Then user go to the description page and click the finish button 
