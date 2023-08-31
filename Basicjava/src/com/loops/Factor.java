package com.loops;
import java.util.Scanner;

public class Factor {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int i;
		System.err.println("the factor of"+num+"are");
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i+"");
			}
		}
		
		

	}

}
