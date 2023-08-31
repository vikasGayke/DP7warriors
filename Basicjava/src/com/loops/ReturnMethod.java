package com.loops;

import java.util.Scanner;

public class ReturnMethod {

	static int factorial(int num) {

		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact *= 1;
		}
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int result = factorial(num);
		System.out.println("factorial of " +num+ "is" +result);

	}

}
