package com.ifelse;
import java.util.Scanner;

public class GrossSalary 
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double salary=sc.nextDouble();
		
		if (salary<=10000)
		{
			
			System.out.println((salary*0.20)+(salary*0.80));
		}
		
		else if (salary>20000)
		{
			System.out.println((salary*0.25)+(salary*0.90));
		}
		
		else
		{
			System.out.println("error");
		}
		

	}

}
