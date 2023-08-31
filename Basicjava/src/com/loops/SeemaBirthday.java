package com.loops;
import java.util.Scanner;

public class SeemaBirthday {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("seemas birthday");
		int year=sc.nextInt();
		int result=0;
		for(int i=1;i<=year;i++)
			{
			result=i*i*i;
			
		}
		System.out.println("for  "+year+" year  resive gold coin...." +result);


	}

}
