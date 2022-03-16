package com.nse.assignments;

public class Area {
	
	public static double areaOfSquare(double a)
		{
			double SA = a*a;
			return SA;
		}
	
	public static double areaOfTrapezium(double h, double a, double b )
		{
			double TA = 0.5*h*(a+b);
			return TA;
		}
	

	public static void main(String[] args) {
		double side = 10;
		double hight = 10;
		double side1 = 5;
		double side2 = 6;
		double res2 = Area.areaOfTrapezium(hight, side1, side2);
		double res =Area.areaOfSquare(side);
		System.out.println("Area of trapezium :"+ res2);
		System.out.println("Area of square :"+ res);
	}

}
