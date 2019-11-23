Feature: Developer

Background:
	Given I open browser and launch Developer URL
	Then I validate the initialization of Angular on page
	

Scenario: To validate the Documentation Page
	Then I check the Internal Links present on documentation page
	And I validate whether all links are getting loaded or not
	Then I quit the driver