package com.gojek.gofood.model;

import java.util.ArrayList;
import java.time.LocalTime;

public class Merchant {
	private String name;
	private float rating;
	private String location;
	private float distanceFromCustomer;
	private LocalTime openTime;
	private LocalTime closedTime;
	private ArrayList<Product> productsList;
	
	// CONSTRUCTORS
	public Merchant(String name, float rating, String location, float distanceFromCustomer, LocalTime openTime, LocalTime closedTime) {
		this.name = name;
		this.rating = rating;
		this.location = location;
		this.distanceFromCustomer = distanceFromCustomer;		
		this.closedTime = closedTime;
		this.openTime = openTime;
		productsList = new ArrayList<Product>();
	}
	
	public Merchant() {
		this("",0,"",0,null,null);
	}
	public Merchant(String name) {
		this(name,0,"",0,null,null);
	}
	public Merchant(String name, float distance) {
		this(name,0,"",distance,null,null);
	}
	public Merchant(float rating) {
		this("",rating,"",0,null,null);
	}
	public Merchant(String name,LocalTime openTime, LocalTime closedTime) {
		this(name,0,"",0,openTime,closedTime);
	}
	
	//GETTERS & SETTERS
	public float getRating() {
		return this.rating;
	}
	public void setclosedTime(LocalTime closedTime) {
		this.closedTime = closedTime;
	}
	public void setopenTime(LocalTime openTime) {
		this.openTime = openTime;
	}
	public LocalTime getopenTime() {
		return this.openTime;
	}
	public LocalTime getclosedTime() {
		return this.closedTime;
	}
	public void setRating(float rating) {
		this.rating = rating;
		}
	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getDistanceFromCustomer() {
		return this.distanceFromCustomer;
		}
	public void setDistanceFromCustomer(float distanceFromCustomer) {
		this.distanceFromCustomer = distanceFromCustomer;
	}
	public ArrayList<Product> getProductsList(){
		return productsList;
	}
	public void addProduct(Product p) {
		productsList.add(p);
		p.setMerchant(this);
	}
}
