package com.condition;
import java.util.Scanner;

public class NestedDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number....");
		int num1=sc.nextInt();
		System.out.println("Enter the Secound number....");
		int num2=sc.nextInt();
		System.out.println("Enter the third  number.....");
		int num3=sc.nextInt();
		if(num1>num2)
		{
			if (num1>num3)
			{
				System.out.println("num1 is gretest...");
			}
			else
		
			{
				if (num2>num3)
				{
					System.out.println("num2 is gretest...");
				}
				else
				{
					System.out.println("num3 is gretest...");

				}
				
			}
		}
		


	}

}
