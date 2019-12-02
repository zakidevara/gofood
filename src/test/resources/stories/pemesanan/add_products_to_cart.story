Adding products to the shopping cart
Narrative:
In order to order multiple products at once
As a customer
I want to store selected products to a shopping cart
					 
Scenario: Adding a product to an empty cart
Given an empty cart
And a list of products : Whopper Meal Medium, Paket Geprek Bensu, Paket McSpicy Smokey BBQ Medium
And the product's merchants in the same order are : Burger King, Geprek Bensu, McDonald's
When I add 2 Whopper Meal Medium to the cart
Then there should be 2 Whopper Meal Medium inside the cart
