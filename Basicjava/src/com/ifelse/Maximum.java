package com.ifelse;

import java.util.Scanner;

public class Maximum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 =sc.nextInt();
		System.out.println("Enter secound number");
		int num2=sc.nextInt();
		System.out.println("Enter third number");
		int num3 =sc.nextInt();
		int max=num1;
	
	if (num2>max)
	{
		max=num2;
	}
	if(num3>max)
	{
		max=num3;
	}
	System.out.println("the maximum number is:"+max);
	}
	

	
}
