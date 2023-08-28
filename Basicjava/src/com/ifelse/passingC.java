package com.ifelse;
import java.util.Scanner;

public class passingC {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Stream");
		String stream=sc.next();
		System.out.println("Enter persentage");
		int persentage=sc.nextInt();
		
		switch(stream) 
		{
		case "MBA":
			System.out.println("you are choosing MBA");
			switch (persentage)
			{
			case 75:
				System.out.println("you got addmition for MBA.");
				break;
			case 70:
				System.out.println("you got addmition for MCA.");
				break;
				default:
					System.out.println("beter luck next time.");
				
			}
			break;
		case "MCA":
			System.out.println("you are choosing MCA.");
			switch(persentage)
			{
			case 75:
				System.out.println("you got a addmition for MBA.");
				break;
			case 70:
				System.out.println("you got a addmition for MCA.");
				break;
				default:
					System.out.println("beter luck next time.");
			}
			
        
		}
		

	}

}
