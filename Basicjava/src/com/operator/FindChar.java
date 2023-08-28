package com.operator;

import java.util.Scanner;

public class FindChar {


	public static void main(String args[])
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter char.....");
	char cr=sc.next().charAt(0);
	
	if ((cr>='a'&&cr<='z') || (cr>='A'&&cr<='z'))
	{
	System.out.println("it is small char......");
	}
	
	else if(cr>='0'&& cr<='9') {
	System.out.println("it is digit");
	}
	 	else
	 
	 System.out.println("it is special char.....");
	}
	}
	


		
	
	


