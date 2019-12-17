package com.gojek.gofood.model;

public class CartItem {
	private Product product;
	private int quantity;
	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
		
	public String getName() {
		return product.getName();
	}
	public int getQuantity() {
		return this.quantity;
	}
	
	public boolean equals(CartItem other) {
		return this.getName().equals(other.getName()) && this.getQuantity() == other.getQuantity();
	}
	
	public Product getProduct() {
		return product;
	}


}
