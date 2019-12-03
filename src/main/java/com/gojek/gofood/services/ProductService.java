package com.gojek.gofood.services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.gojek.gofood.model.*;

public class ProductService {
	private List<Product> productsList;	
	private class DistanceComparator implements Comparator<Product>{
		public int compare(Product product1, Product product2) {
			return ((Float) (product1.getDistance())).compareTo( (Float)product2.getDistance());
		}
	}
	
	private class RateComparator implements Comparator<Product>{
		public int compare(Product product1, Product product2) {
			return ((Float) (product1.getRating())).compareTo( (Float)product2.getRating());
		}
	}
	
	private class CategoryComparator implements Comparator<Product>{
		public int compare(Product product1, Product product2) {
			return((String) (product1.getCategory())).compareTo( (String)product2.getCategory());
		}
	}
	
	public ProductService(List<Product> pl) {
		productsList = pl;
	}	
	
	public List<String> getDiscountedProductsName() {
		ArrayList<String> result = new ArrayList<String>();
		for(Product e : productsList) {
			if(e.getDiscount() > 0)
				result.add(e.getName());
		}
		return result;
	}
	
	public List<String> getProductsNameOrderByDistanceAsc(){
		ArrayList<String> result = new ArrayList<String>();
		Collections.sort(productsList, new DistanceComparator());
		for(Product e : productsList) {
			result.add(e.getName());
		}		
		
		return result;
	}
	
	public List<String> getProductsNameOrderByRate(){
		ArrayList<String> result = new ArrayList<String>();
		Collections.sort(productsList, Collections.reverseOrder(new RateComparator()));
		for(Product e : productsList) {
			result.add(e.getName());
		}		
		
		return result;
	}
	

	public Product find(String productName) {
		for(Product p : productsList) {
			if(p.getName().equals(productName))
				return p;
		}
		return null;
	}

	public List<String> getCategoryTypeOfProducts() {
		ArrayList<String> result = new ArrayList<String>();
		Collections.sort(productsList, Collections.reverseOrder(new CategoryComparator()));
		for(Product e : productsList) {
			result.add(e.getName());
		}
		return result;
	}
	
}
