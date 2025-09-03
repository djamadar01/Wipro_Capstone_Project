Feature: Validate login Page 
Scenario Outline: Check for valid and invalid credentials 
Given login page should be open in default browser
When click on login button and enter valid <email> and <password1>
And click on signin button check <status>
Then login successfully and open home page
Examples:
|email|password1|status|
|danis3@gmail.com|awfege|fail|
|dfdfaf|Pass@123|fail|
|wegbrfeb|agrsgvbfsv|fail|
|danis3@gmail.com|Pass@123|pass|