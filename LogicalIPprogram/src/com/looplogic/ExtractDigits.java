package com.looplogic;

public class ExtractDigits {

	static void extract(int num) {
		System.out.println("the digit in a number" + num + " are: ");
		while (num != 0) {
			System.out.println(num % 10);
			num = num / 10;
		}

	}

	public static void main(String args[]) {
		extract(5876);
	}

}
