Adding products to the shopping cart
Narrative:
In order to order multiple products at once
As a customer
I want to store selected products to a shopping cart
					 
Scenario: Adding a product to an empty cart
Given an empty cart
And a list of products name : Whopper Meal Medium, Paket Geprek Bensu, Paket McSpicy Smokey BBQ Medium
And the product's merchants in the same order are : Burger King, Geprek Bensu, McDonald's
When I add 2 of Whopper Meal Medium to the cart
Then there should be 2 of Whopper Meal Medium inside the cart

Scenario: Adding sold out product
Given a sold out product : Whopper Meal Medium
When I add 1 of Whopper Meal Medium to the cart
Then there should be 0 of Whopper Meal Medium inside the cart