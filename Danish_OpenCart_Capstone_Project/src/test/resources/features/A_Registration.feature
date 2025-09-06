Feature: Checking  User Registration Functionality
Scenario Outline: Fill user details for registration 
Given Registration Webpage Open on browser
When Fill <FirstName> and <LastName> and <Email> and <MBNumber> and <Password> and <ConfirmPassword>
Then Registration Done
Examples:
|FirstName|LastName|Email|MBNumber|Password|ConfirmPassword|
|Danish|Jamadar|ajfhskajfhk@gmail.com|"9763060269"|Pass@123|Pass@123|