package com.loops;
import java.util.Scanner;

public class PrintTable {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to print its table:");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"x"+i+"="+(num*i));
		}
		sc.close();
	}

}
