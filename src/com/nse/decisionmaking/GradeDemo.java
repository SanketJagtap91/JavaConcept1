package com.nse.decisionmaking;

public class GradeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		
		if(a>=90)
		{
			System.out.println("Grade A");
		}
		else if(a<=89 && a>=80)
		{
			System.out.println("Grade B");

		}
		else if(a<=79 && a>=60)
		{
			System.out.println("Grade C");

		}
		else if(a<=59 && a>=45)
		{
			System.out.println("Grade D");

		}
		else
		{
			System.out.println("Grade F	");

		}
	}

}
