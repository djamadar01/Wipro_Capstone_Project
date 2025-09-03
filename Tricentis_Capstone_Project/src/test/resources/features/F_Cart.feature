Feature: Testing Tricentis Add and Delete Cart  
Scenario: Add and delete any product  
Given Open product that is to be added in cart
When add product to cart
And Open cart and remove product
Then check product is deleted