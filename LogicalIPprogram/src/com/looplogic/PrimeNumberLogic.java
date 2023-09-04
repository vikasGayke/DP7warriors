package com.looplogic;

public class PrimeNumberLogic {
	static boolean cheakPrime(int n)

	{
		boolean status = true;
		if ((n == 0) || (n == 1))
			status = false;
		else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % 1 == 0) {
					status = false;
					break;
				}
			}

		}
		return status;
	}

	public static void main(String args[]) {
		System.out.println((23));
	}
}