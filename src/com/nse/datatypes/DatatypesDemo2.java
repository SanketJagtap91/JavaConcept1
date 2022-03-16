package com.nse.datatypes;

public class DatatypesDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] colours = new String[3];
		colours[0] = "Red"; 
		colours[1] = "Green";
		colours[2] = "yellow";
		System.out.println(colours);
		System.out.println(colours[0]);
		System.out.println(colours[1]);
		System.out.println(colours[2]);
		
		//char[] letters = new char [3];
		char[] letters = {'a','@','c'};
		System.out.println(letters);
		System.out.println(letters.hashCode());
		

	}

}
