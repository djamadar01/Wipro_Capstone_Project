Feature: Check Registration Functionality 
Scenario:Fill all the details and create register user 
Given Registration Page should be Open for registration
When Select Gender
And Write First Name and Last Name
And Write Your Personal Email ID
And Create new unique Password in Password field and Write same password in confirm Password Field
Then User Registered
