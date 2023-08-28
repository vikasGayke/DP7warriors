package com.ifelse;

import java.util.Scanner;

public class owelConsonant {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter alphabet");
		 char ch = sc.next().charAt(0);
		 
		 if(ch=='a' || ch=='b'|| ch=='d'||ch=='i')
		 {
			System.out.println("this are vowel"); 
		 }
		 else
		 {
			System.out.println("this is consonant");
		 }
		
	}

}
 