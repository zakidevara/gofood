package com.gojek.gofood.model;

public class Product {
	private String name;
	private float discount;
	private float price;
	private float distance;
	private float rate;
	
	public Product(String name) {
		this.name = name;
		discount = 0;
		price = 0;
		distance = 0;
	}
	
	public String getName() {return name;}
	public void setName(String newName) { name = newName;}
	public float getDiscount() {return discount;}
	public void setDiscount(float newDiscount) { discount = newDiscount;}
	public float getDistance() {return distance;}
	public void setDistance(float newDistance) { distance = newDistance;}
	public float getPrice() {return price - (price*discount);}
	public void setPrice(float newPrice) { price = newPrice;}
	public float getRate() {return rate;}
	public void setRate(float newRate) { rate = newRate;}
}
