package com.ifelse;
import java.util.Scanner;

public class InterfaceFactor {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number....");
		int num1=sc.nextInt();
		System.out.println("Enter the secound number...");
		int num2=sc.nextInt();
		if (num1%num2==0)
		{
		System.out.println("the num2 is factor of first..");	
		}
		else if(num1%num2!=0)
		{
		System.out.println("not a factor");
		}
		else
		{
			System.out.println("factor gretor than number");
		}
	}

}
