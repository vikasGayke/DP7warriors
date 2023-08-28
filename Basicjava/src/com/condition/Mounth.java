package com.condition;
import java.util.Scanner;

public class Mounth {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("mounth in a day lowercase");
	String mounth=sc.next();
	switch(mounth)
	{
	case "january":
	case "march":
	case "may":
	case "july":
	case "august":
	case "october":
	case "december":
		System.out.println("31 days");
		break;
	case "april":
	case "june":
	case "september":
	case "november":
		System.out.println("30 days");
		break;
	case "february":
		System.out.println("Enter the year");
		int year=sc.nextInt();
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
		{
			System.out.println("29 days");
		}
		else
		{
			System.out.println("28 days");
		}
		break;
		default:System.out.println("error in input");
		
		
		
	}

	}

}
