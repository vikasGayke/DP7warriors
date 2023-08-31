package com.loops;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long fact=1;
		System.out.println("Enter numbers");
		int num=sc.nextInt();
		for(int  i=1;i<=num;i++)
		{
			num*=i;
		}
		
		System.out.println("factorial of"+num);
		
	

	}

}
