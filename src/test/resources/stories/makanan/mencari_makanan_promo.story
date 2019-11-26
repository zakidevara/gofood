Find out which products are on sale

Narrative:
In order to get the best deals available
As a customer
I want to know which products are on sale
	
Scenario: Find products on sale
Given a list of products : Whopper Meal Medium, Paket Geprek Bensu, Paket McSpicy Smokey BBQ Medium
When these products are discounted in the same order: 20%, 0%, 40%
Then I should be told about the products : Whopper Meal Medium, Paket McSpicy Smokey BBQ Medium



Scenario: Find products with the closest distance
Given a list of products : Whopper Meal Medium, Paket Geprek Bensu, Paket McSpicy Smokey BBQ Medium
When the distances between the product and the customer in the same order are : 0.4, 1.9, 0.8 in kilometers
Then I should be told about the products in order : Whopper Meal Medium, Paket McSpicy Smokey BBQ Medium, Paket Geprek Bensu


Scenario: Find products with the highest rate
Given a list of products : Whopper Meal Medium, Paket Geprek Bensu, Paket McSpicy Smokey BBQ Medium
When the rates of the products are : 4, 3.9, 4.5 in stars
Then I should be told about the products in order : Paket McSpicy Smokey BBQ Medium, Whopper Meal Medium, Paket Geprek Bensu

					 
