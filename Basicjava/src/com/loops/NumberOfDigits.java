package com.loops;
import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num1=sc.nextInt();
		int digit = 0;
		while(num1>0)
		{
			int rem=num1%10;
			num1=num1/10;
			
			if (rem>digit)
			{
				digit=rem;
			}
			num1=num1/10;
		}
		
		System.out.println("the gretest digit is:"+digit);
		


	}

}
