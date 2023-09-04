package com.loops;

import java.util.Scanner;

public class ArmsStrong {
	static void armstrong(int num) {
		int sum = 0;
		int temp = num;
		while (num > 0) {

			int rem = num % 10;

			sum = sum + rem * rem * rem;
			num /= 10;
			System.out.println(sum);
			System.out.println(num);

		}
		System.out.println(temp);
		if (sum == temp) {
			System.out.println("armstrong");
		} else
			System.out.println("not armstrong");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		armstrong(153);

	}
}
