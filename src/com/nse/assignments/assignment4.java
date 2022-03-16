package com.nse.assignments;

public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double[] temp = {10.0, 11.3, 4.5, -2.0, 3.6, -3.3, 0.0};
		double[] temp = {5.0, 11.0, 12.5, -2.0, 3.6, -4.3, 9.0};
		int i;
		double a = 0;
		for(i=0;i<temp.length-1;i++)
		{
			if (a>temp[i+1])
				{
				a=temp[i+1];
				}
		}
		System.out.println("Minimum temp is : " + a);
		
		for(i=0;i<temp.length-1;i++)
		{
			if (a<temp[i+1])
				{
				a=temp[i+1];
				}
		}
		System.out.println("Maximum temp is : " + a);
	}
}
