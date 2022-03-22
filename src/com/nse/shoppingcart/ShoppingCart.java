package com.nse.shoppingcart;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item shirt = new Item();
		Item pants = new Item();
		Item laptop = new Item();

		
		shirt.description = "shirt";
		pants.description = "pants";
		laptop.description = "laptop";
		
		shirt.quantity = 5;
		laptop.quantity = 3;
		
		shirt.price = 500;
		laptop.price = 30000;
		
		shirt.printItem(shirt,pants,laptop);
		
		
		
				
		
		
		
		
		
		
		
		
		

	}

}
