package com.loops;

import java.util.Scanner;

public class FactorialMethod {
	static void factorial(int num) {

		int fact = 1;
		
		

		for (int i = 1; i <= num; i++) {
			fact *= 1;
		}
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("factorial  of  " + num + "  is:  " + fact);

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		factorial(num);
	}

}
