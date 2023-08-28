package com.ifelse;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
System.out.println("Enter the electricity unit");

double unit=sc.nextDouble();

if (unit<=50)
	{
	double bill=unit*0.50;
		System.out.println((bill/100*20)+bill);
	}
else if(unit<=150)
{
	double bill=unit*0.75;
	System.out.println((bill/100*20)+bill);
}
else if(unit<=250)
{
	double bill=unit*1.20;
	System.out.println((bill/100*20)+bill);
}

else if(unit>250)
{
	double bill=unit*1.50;
	System.out.println((bill/100*20)+bill);
}
else {
	System.out.println("error");
}
	

}
}
