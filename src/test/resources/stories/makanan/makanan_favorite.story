Save a list of favorited products

Narrative:
In order to find favorite products easily
As a customer
I want to store favorited products in one place
					 
Scenario: Favoriting a product
Given a user with no favorited products
And available products : Paket Geprek Bensu, Whopper
When the user favorited Paket Geprek Bensu 
Then the user should have : Paket Geprek Bensu in their favorited products

