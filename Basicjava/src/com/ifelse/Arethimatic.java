package com.ifelse;
import java.util.Scanner;

public class Arethimatic {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter1:Addition \n enter2:Sub \n enter3:Div \n enter3: mul \n ");
		System.out.println("Enter number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter choice");
		int num=sc.nextInt();
		
		switch(num)
		{
			case 1:
				int sum=num1+num2;
				System.out.println("  Addition:"+sum);
				break;
		case 2:
			int sub=num1-num2;
			System.out.println("sub:"+sub);
			break;
			
		case 4:
			int div=num1/num2;
			System.out.println("div:"+div);
			break;
			
		case 3:
			int mul=num1*num2;
			System.out.println("mul:"+mul);
			break;
		
			default:
				System.out.println("error");

	}

}}
