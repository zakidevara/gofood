package com.gojek.gofood.model;
import java.time.LocalTime;
public class CartItem {
	private Product product;
	private int quantity;
	private LocalTime timeAdded;
	public CartItem(Product product, int quantity, LocalTime timeAdded) {
		this.product = product;
		this.quantity = quantity;
		this.timeAdded = timeAdded;
	}
	public CartItem(Product product, LocalTime timeAdded) {
		this(product,0,timeAdded);
	}
	public CartItem(Product product, int quantity) {
		this(product,quantity,null);
	}
	public String getName() {
		return product.getName();
	}
	public LocalTime getTime() {
		return this.timeAdded;
	}
	public void setTime(LocalTime timeAdded) {
		this.timeAdded = timeAdded;
	}
	public int getQuantity() {
		return this.quantity;
	}
	
	public boolean equals(CartItem other) {
		return this.getName().equals(other.getName()) && this.getQuantity() == other.getQuantity();
	}
	


}
