package com.condition;


public class VotingEligiblity {

	public static void main(String[] args)
	{
	
		int age=19;
		String status;
		status=(age>=18)?"yes":"no";
		System.out.println(status);
		
		if(age>18)
		{
			status="yes";
		}
		else
		{
			status ="no";
		}
		System.out.println(status);
		

	}



}
