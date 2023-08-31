package com.loops;
import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long fact=1;
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact*=1;
		}
		for(int i=num;i>0;i--)
		{
			fact*=i;
		}
		System.out.println("  factorial  of  "+num+"  is:  "+fact);
		

	}

}
