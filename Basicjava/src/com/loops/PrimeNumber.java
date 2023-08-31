package com.loops;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int num=sc.nextInt();
		//boolean flag=false;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				//flag=true;
				count=1;
				break;
			}
			
			}
		if(count==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
			
		
		

	}

	}

