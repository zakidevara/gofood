package com.gojek.gofood.model;

import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<CartItem> itemList;
	public ShoppingCart() {
		itemList = new ArrayList<CartItem>();
	}
	
	public ArrayList<CartItem> getItemList(){
		return this.itemList;
	}
	
	public void add(CartItem item) {
		if (itemList.size() > 0 && item.getProduct().getMerchant().equals(itemList.get(0).getProduct().getMerchant())) {
			itemList.add(item);
		}
		
	}
	
	public CartItem find(String itemName) {
		for(CartItem item : itemList) {
			if(item.getName().equals(itemName)) {
				return item;
			}
		}
		return null;
	}
}
