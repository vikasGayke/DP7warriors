package com.condition;
import java.util.Scanner;

public class SimpleCalculator
{
	public static void main(String aargs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:.....");
		double num1=sc.nextDouble();
	System.out.println("Enter an operator(+,-,*,/):");
	char operator=sc.next().charAt(0);
	System.out.println("Enter secound number:");
	double num2=sc.nextDouble();
	double result=0;
	switch (operator)
	{
	case '+':
		result= num1+num2;
		break;
	case '-':
		result= num1-num2;
		break;
	case '*':
		result=num1*num2;
		break;
	case '/':
		
		if(num2 >=0) 
		{
			result=num1/num2;
	}
		else
		{
		System.out.println("cannot divide by zero.");
		return;
		}
	break;
	default:
		System.out.println("Invalid operator.");
		return;
	}
	System.out.println("result:"+result);
	
	}
}
	
