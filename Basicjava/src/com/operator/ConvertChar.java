package com.operator;

public class ConvertChar {

	public static void main(String[] args)
	{
		char ch='a';
		int ch1=ch;
		System.out.println(ch1);
		
		int x1=32;
		char ch2=(char)x1;
		System.out.println(ch2);
		
		char value1='a';
		int value2=(char)value1-32;
		System.out.println(value2);
		
        char value3='A';
        char value4=(char) ((char)value3+32);
        System.out.println(value4);
		
        int value5='d';
        int value6=(char)value5-45;
        System.out.println(value6);
        {
        	
        }
	}

}
