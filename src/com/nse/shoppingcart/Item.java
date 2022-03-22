package com.nse.shoppingcart;

public class Item {
 public int ID;
 public String description;
 public int quantity;
 public double price;
 


 
 public void printItem(Item shirt, Item pants, Item laptop)
 {
	 System.out.println("Details of cart --------"+"\nITEM -: "+shirt.description+"\tQUANTITY -"+shirt.quantity+ "\tPRICE -: "+shirt.price
			 +"\nITEM -: "+pants.description+ "\tQUANTITY -: "+pants.quantity+ "\tPRICE -: "+pants.price
			 +"\nITEM -: "+laptop.description+ "\tQUANTITY -: "+laptop.quantity+ "\tPRICE -: "+laptop.price);

 }
}
