package com.condition;
import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days in(1-7)...");
		int days=sc.nextInt();
		switch(days)
		{
		case 1:System.out.println("monday");
		break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("wednesday");
		break;
		case 4:System.out.println("thursday");
		break;
		case 5:System.out.println("friday");
		break;
		case 6:System.out.println("saterday");
		break;
		case 7:System.out.println("sunday");
		break;
		
		}
		

	}

}
