package com.ifelse;

import java.util.Scanner;

public class HdfcATM {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to HDFC ATM...");

		double balance = 10000;

		System.out.println("Enter your pin...");
		int p = sc.nextInt();
		if (p == 12345) {

			System.out.println("Enter 1 to deposit");
			System.out.println("Enter 2 to withdraw");
			System.out.println("Enter 3 to check balance");
			System.out.println("Enter 4 to Exit");
			System.out.println("Enter choise");
			int choise = sc.nextInt();

			if (choise == 1) {
				System.out.println("Enter the deposit amount...");
				int deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("your balance is:" + balance);
			}

			else if (choise == 2) {

				System.out.println("Enter withdraw amount....");
				int withdraw = sc.nextInt();
				balance = balance - withdraw;
				System.out.println("your balance is:" + withdraw);
			}

			else if (choise == 3) {

				System.out.println(" balance is:" + balance);
			} else if (choise == 4) {

				System.out.println("thaks for banking");
			}

		}

		else {
			System.out.println("Enter pin is incorrect");

		}

	}
}
