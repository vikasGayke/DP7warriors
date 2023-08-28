package com.operator;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	double radius,area,perimeter;
	
	System.out.println("Enter the radius:");
	
	radius=sc.nextDouble();
	
	area= Math.PI * radius;
	
	perimeter= 2 * Math.PI*radius;
	
	System.out.println("Area is ;"+area);
	System.out.println("perimeter:"+perimeter);
	
	sc.close();
	}

	
	
	

	}


