Feature: CRM Login validation

Scenario: Valid Login test
Given Launch the url
When Enter credentials
			|uname|pwd|
			|kalaiyarasanece90@gmail.com|Sakthivel@1991|
Then User in Home page
And Close the browser
