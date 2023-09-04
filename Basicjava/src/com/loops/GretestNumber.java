package com.loops;

import java.util.Scanner;

public class GretestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num1 = sc.nextInt();

		int rem1 = num1 % 10;
		num1 = num1 / 10;
		while (num1 != 0) {

			int rem2 = num1 % 10;
			num1 = num1 / 10;

			if (rem2 < rem1) {
				rem1 = rem2;

			}
			num1 = num1 / 10;
		}

		System.out.println("the minimum number is:" + rem1);

	}

}
