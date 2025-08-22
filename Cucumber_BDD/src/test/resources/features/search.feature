Feature: check user is able to login with valid credetials
Scenario Outline: successful login
Given search button available
When Enter Inputs<search1>
Then list of output search
Examples:
|search1|
|Personal Banking - Loans - Credit|		
|Free Access to Online Banking|	
|Transfer Funds|
|Pay Bills|
	