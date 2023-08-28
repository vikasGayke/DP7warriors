package com.ifelse;
import java.util.Scanner;

public class Dvisiblity {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		if(number % 5 == 0 && number % 11 == 0)
		{
		System.out.println("Divisible by both 5 and 11:"+number);
		}
		else
		{
			System.out.println(" not Divisible both 5 and 11:"+number);
		}
	}

}
 