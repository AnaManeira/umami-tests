Feature: Check banner on home page

	Background: I go to the home page
  	Given I am on 'https://ana:ana@dev-demonstrate.pantheonsite.io/'

  Scenario: I as an user want to check the banner on home page
		Then I see a banner element
		And the background image is '/sites/default/files/veggie-pasta-bake-hero-umami.jpg'
		And an element with text 'Super easy vegetarian pasta bake'
		And an element with text 'A wholesome pasta bake is the ultimate comfort food. This delicious bake is super quick to prepare and an ideal midweek meal for all the family.'
		And an element with text 'View Recipe'
		And an element with link '/en/recipes/super-easy-vegetarian-pasta-bake'