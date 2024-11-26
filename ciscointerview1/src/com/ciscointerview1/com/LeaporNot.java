package com.ciscointerview1.com;

public class LeaporNot {
	public static void main(String [] args)
	{
		int year=2021;
		
		if(year%4==0 && year%100 !=0)
		{
			System.out.println("given year is leap year");
		}
		else
		{
			System.out.println("given yar is not a leap year");
		}
	}

}
