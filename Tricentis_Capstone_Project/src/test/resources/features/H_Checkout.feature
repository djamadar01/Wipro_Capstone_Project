Feature: Checking checkout functionality 
Scenario: Odering a product 
Given Customer should log in the account
When Fill all details for checking out
And confirm all order details and checkout
Then Order placed Sucessfully