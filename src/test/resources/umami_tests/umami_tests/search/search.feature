Feature: Search 

	Background: I go to the home page
  	Given I am on 'https://ana:ana@dev-demonstrate.pantheonsite.io/'

  	Scenario: I as an user want to search by a valid keyword, ingredient or dish
  	Then I search by "cake"
  	And I see Search Results
  	
  	Scenario:  I as an user want to search by a invalid keyword, ingredient or dish
  	Then I search by "abc"
  	And I see an element with text "Your search yielded no results."