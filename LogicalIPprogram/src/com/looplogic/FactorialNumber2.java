package com.looplogic;

public class FactorialNumber2 {

	static long factNumber(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String args[]) {
		long ans;

		ans = factNumber(5);
		System.out.println("the factorial of 5 is:" + ans);
		ans = factNumber(9);
		System.out.println("the factorial of 9 is" + ans);
		System.out.println("the factorial of 5 is" + factNumber(5));
	}
}