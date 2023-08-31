package com.loops;

import java.util.Scanner;

public class SeemasNumber {
	static void countdigit(int num, int lucky) {
		int count = 0;
		while (num > 0)

		{

			int rem = num % 10;
			if (rem == lucky)
				count++;
			num = num / 10;

		}
		System.out.println("Enter count of number is:" + count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();

		System.out.println("Enter car  number:");
		int n = sc.nextInt();
		System.out.println("Enter the lucky number");
		int lucky = sc.nextInt();
		countdigit(n, lucky);

	}
}
