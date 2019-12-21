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

Scenario: Sort favorite list by date from newest to oldest
Given a list of favorited products
And list of favorited products are: Paket Geprek Bensu, Whopper in their favorited products
When the dates of the favorited products are: 20/07/2019, 04/10/2019
Then the user should have: Whopper, Paket Geprek Bensu in their favorited products