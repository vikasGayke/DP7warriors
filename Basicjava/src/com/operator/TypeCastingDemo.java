package com.operator;

public class TypeCastingDemo {
	public static void main(String args[])
	{
	byte num1=78;
	byte num2=56;
	
	byte sum=(byte) (num1+num2);
	
	short s1=78;
	short s2=56;
	short r=(short) (s1+s2);
	
	System.out.println(sum);
	
	System.out.println(r);
	
	float n1 = (float) 78.4f;
	float n2 = 56.6f;
	
	int result = (int) (n1+n2);
	
	System.out.println(result);
	
	int a=90;
	int b=45;
	
	float ans = a + b;
	
	System.out.println(ans);
	}
	
	

}
