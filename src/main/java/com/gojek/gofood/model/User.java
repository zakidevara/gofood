package com.gojek.gofood.model;

import java.util.ArrayList;

public class User {
	private String name;
	private ArrayList<Product> favoriteProducts;
	
	public User(String name) {
		this.name = name;
		this.favoriteProducts = new ArrayList<Product>();
	}
	public User() {
		this("");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String newName) { 
		name = newName;
	}
	public ArrayList<Product> getFavoriteProducts(){
		return favoriteProducts;
	}
	
	public void addFavoriteProduct(Product favoritedProduct) {
		favoriteProducts.add(favoritedProduct);
	}
	
}
