package com.operator;
import java.util.Scanner;
public class Information 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of persion");
	String name=sc.next();
	System.out.println("Enter the ege");
	int age= sc.nextInt();
	System.out.println("Enter the height");
	float height=sc.nextFloat();
	System.out.println("Enter the gender");
	char gender= sc.next().charAt(0);
	System.out.println("name: "+name+"height: -"+height+"age:"+age+"");
	

	
}

}
