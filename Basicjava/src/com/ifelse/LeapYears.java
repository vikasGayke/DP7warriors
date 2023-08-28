package com.ifelse;
import java.util.Scanner;

public class LeapYears {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int year = sc.nextInt();
	String a=((year % 4 == 0 && year%100 !=0) || (year%400==0))?"true":"False";
	
	System.out.println(a);

		}
		 





		

	}


