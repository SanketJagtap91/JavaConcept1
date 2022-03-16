package com.nse.assignments;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Smith, John, Henry;
//		Smith = 25;
//		John = 45;
//		Henry = 65;	
		
		Smith = 25;
		John = 25;
		Henry = 25;		
		
		if (Smith < John && Smith < Henry)
			{
				System.out.println("Smith is younger.");
			}
		else if (John < Smith && John < Henry)
			{
				System.out.println("John is younger.");
			}
		else if (John == Henry && John == Smith)
			{
			System.out.println("Smith, John and Henry are same age.");
			}
		else 
			{
				System.out.println("Henry is younger.");
			}
		
	}

}
