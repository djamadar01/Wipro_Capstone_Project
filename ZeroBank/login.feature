Feature: Validate login Page 
Scenario Outline: Check for valid and invalid credentials 
Given login page should be open in default browser
When click on login button and enter valid <username1> and <password1>
And click on signin button check <status>
Then login successfully and open home page
Examples:
|username1|password1|status|
|adegsSDSFG|password|fail|
|username|sfdgsfdg|fail|
|wegbrfeb|agrsgvbfsv|fail|
|username|password|pass|