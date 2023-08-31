package com.loops;
import java.util.Scanner;

public class SumofOdd {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int sum=0,count=0;
		
		for(int i=1;i<number;i++)
		{
			if(i%2!=0)
			{
				sum+=i;
				count++;
				
				
			}
		}
		
System.out.println(" the sum of odd number "  +sum);
System.out.println("number of odd"+count);
	}

}
