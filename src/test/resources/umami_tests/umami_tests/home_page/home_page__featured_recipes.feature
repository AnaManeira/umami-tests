Feature: Check home page featured recipes

	Background: I go to the home page
  	Given I am on 'https://ana:ana@dev-demonstrate.pantheonsite.io/'
  	
  	Scenario: I as an user want to see the featured list of recipes on the home page
  	And an element with text 'Explore recipes across every type of occasion, ingredient, and skill level'
    And a list with 4 elements '//*[@id="block-umami-content"]//div[@class="view-content"]/div[@class="views-row"]'
    
    Scenario: Check wheter the link to the recipes are valids
    Then I click on element with xpath '<xpath>'
    And I am on the page with URL '<url>'
    
    Examples:
    |xpath                                                                                                                                      |url                                                                                  |
    |//*[@id="block-umami-content"]//div[@class="view-content"]/div[@class="views-row"]//a[@href="/en/recipes/deep-mediterranean-quiche"]       |https://ana:ana@dev-demonstrate.pantheonsite.io/en/recipes/deep-mediterranean-quiche         |
		|//*[@id="block-umami-content"]//div[@class="view-content"]/div[@class="views-row"]//a[@href="/en/recipes/vegan-chocolate-and-nut-brownies"]|https://ana:ana@dev-demonstrate.pantheonsite.io/en/recipes/vegan-chocolate-and-nut-brownies  |
		|//*[@id="block-umami-content"]//div[@class="view-content"]/div[@class="views-row"]//a[@href="/en/recipes/super-easy-vegetarian-pasta-bake"]|https://ana:ana@dev-demonstrate.pantheonsite.io/en/recipes/super-easy-vegetarian-pasta-bake  |
		|//*[@id="block-umami-content"]//div[@class="view-content"]/div[@class="views-row"]//a[@href="/en/recipes/watercress-soup"]                 |https://ana:ana@dev-demonstrate.pantheonsite.io/en/recipes/watercress-soup                   |