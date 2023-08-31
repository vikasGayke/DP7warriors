package com.loops;
import java.util.Scanner;

public class PartTimeSalary {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter working number of hours");
		int hours=sc.nextInt();
		long salary=hours*100;
		for(int i=1;i<=365;i++)
		{
			if(hours<24)
			{
				salary=100*hours*365;
						
					
			}
		
		}
		System.out.println("earn year salary"+ salary);
		

	}

}
