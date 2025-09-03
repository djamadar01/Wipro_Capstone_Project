Feature: Checking Searching Functionality
Scenario Outline:
Given Open Tricentis home page for searching product
When search <item>
Then Display result
Examples:
|item|
|book|
|laptop|
|jeans|