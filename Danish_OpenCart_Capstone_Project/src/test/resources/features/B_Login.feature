Feature: Checking Login Function 
Scenario Outline: Check using  credentials 
Given Open login page
When Add Email and password from <email> and <password>
And check Status<status>
Then login successfully
Examples:
|email|password1|status|
|qpfgghsh1@gmail.com|awfege|fail|
|dfdfaf|Pass@123|fail|
|wegbrfeb|agrsgvbfsv|fail|
|qpfgghsh1@gmail.com|Pass@123|pass|