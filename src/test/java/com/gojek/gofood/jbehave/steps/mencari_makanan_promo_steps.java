package com.gojek.gofood.jbehave.steps;

import java.util.ArrayList;
import java.util.List;
import com.gojek.gofood.model.*;
import com.gojek.gofood.services.*;

import org.jbehave.core.annotations.*;
import static org.fest.assertions.Assertions.assertThat;

public class mencari_makanan_promo_steps {	
	List<Product> products;
	List<String> proposedProducts;
	ProductService productService;
	
	@Given("a list of products : $givenProducts")
	public void givenListOfProducts(List<String> givenProducts) {
		products = new ArrayList<Product>();
		for(String e : givenProducts) {
			products.add(new Product(e));
		}
		
	}
	
	@When("these products are discounted in the same order: $discounts")
	public void whenProductsAreDiscounted(List<Float> discounts) {
		int i = 0;
		for(Product e : products) {
			e.setDiscount(discounts.get(i));
			i++;
		}
		productService = new ProductService(products);
		proposedProducts = productService.getDiscountedProductsName();
	}
	
	@Then("I should be told about the products : $productsWithPromo")
	public void shouldFindTheseProducts(List<String> productsWithPromo) {
		assertThat(proposedProducts).isEqualTo(productsWithPromo);
	}
	
	@When("the distances between the product and the customer in the same order are : $distances in kilometers")

	public void whenDistancesAre(List<Float> distances) {
		int i = 0;
		for(Product e : products) {
			e.setDistance(distances.get(i));
			i++;
		}
		productService = new ProductService(products);
		proposedProducts = productService.getProductsNameOrderByDistanceAsc();
	}
	
	@Then("I should be told about the products in order : $expectedProducts")

	public void thenShowProductsInOrderOfDistance(List<String> expectedProducts) {
		assertThat(proposedProducts).isEqualTo(expectedProducts);
	}
	
	@When("the rates of the products are : $rates in stars")
	
	public void whenRatesAre(List<Float> rates) {
		int i = 0; 
		for(Product f : products) {
			f.setRate(rates.get(i));
			i++;
		}
		productService = new ProductService(products);
		proposedProducts = productService.getProductsNameOrderByRate();
	}
	
	@Then("I should be told about the products in order : $expectedProducts")

	public void thenShowProductsInOrderOfRates(List<String> expectedProducts) {
		assertThat(proposedProducts).isEqualTo(expectedProducts);
	}
}
