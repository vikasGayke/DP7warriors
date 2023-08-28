package com.operator;
import java.util.Scanner;

public class VolumeCylinder {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		float radius=sc.nextFloat();
		System.out.println("Enter height");
		float height=sc.nextFloat();
		double volume=Math.PI*radius*radius*height;
		System.out.println("Enter volume of cylender:"+volume);
		
	sc.close();	
	}

}
