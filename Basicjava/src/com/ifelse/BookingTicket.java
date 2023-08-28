package com.ifelse;

import java.util.Scanner;

public class BookingTicket {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Airline name");
		String name=sc.nextLine();
		System.out.println("Enter the depart place");
		String depart=sc.nextLine();
		System.out.println("Enter destination place");
		String destination=sc.nextLine();
		System.out.println("Enter coupen code if you");
		int coupon=sc.nextInt();
		
		
		if(coupon==12345)
		{
		double prise=35000;
		System.out.println("we are providing 10 % discount");
		double discount=(prise/20*100);
		double finalprise=(discount-prise);
		
			System.out.println("your final prise is"+finalprise);
			System.out.println("your ticket are book enjoy your journy");

		
		}
		else 
		{	
			
			System.out.println("your ticket are not booked enjoy");
		}
		}
		

}
