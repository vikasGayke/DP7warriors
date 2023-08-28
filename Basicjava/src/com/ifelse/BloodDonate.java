package com.ifelse;

import java.util.Scanner;

public class BloodDonate {
public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age...");
		int age = sc.nextInt();
		System.out.println("Enter your weight...");
		int weight = sc.nextInt();
		if (age > 18)
		{
			
			if (weight >= 70) {
				System.out.println("eligible for blood donate");

			} 
			else 
			{
				System.out.println("your under weight...");
			}
		}
		else 
		{
			System.out.println("your not eligible as your age is not greter than 18");

		}
	
}
}


