package com.ifelse;
import java.util.Scanner;

public class LeapYear {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter year:");
int year = sc.nextInt();
if((year % 4 == 0 && year%100 !=0) || (year%400==0))
{
	System.out.println(year+"is aleap year.");
}
else
{
	System.out.println(year+"is not a leap year.");
}

}
}