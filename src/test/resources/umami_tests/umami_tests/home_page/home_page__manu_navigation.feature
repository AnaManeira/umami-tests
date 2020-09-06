@Menus
Feature: Check menus navigation on home page

	Background: I go to the home page
  	Given I am on 'https://ana:ana@dev-demonstrate.pantheonsite.io/'

  Scenario: Check if Home, Articles, and Recipes are present on the home page
    Then I see a menu link with text 'Home'
    And I see a menu link with text 'Articles'
    And I see a menu link with text 'Recipes'
	
  Scenario: Check menu links
  	Then the menu '<menu_name>' will send to '<menu_link>'
  	
  	Examples:
  	|menu_name|menu_link																						|
  	|Home			|https://dev-demonstrate.pantheonsite.io/en						|
  	|Articles |https://dev-demonstrate.pantheonsite.io/en/articles	|
  	|Recipes  |https://dev-demonstrate.pantheonsite.io/en/recipes		|
  	
