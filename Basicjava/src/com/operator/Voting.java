package com.operator;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ip=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=ip.nextInt();
		if(age>18)
		{
			System.out.println("you can vote");
		}
		else {
	
 System.out.println("you can not vote");
}

}
}
