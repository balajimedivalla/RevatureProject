package com.ciscointerview1.com;

public class PrimeNumber {
	public static void main(String[] args)
	{
		int a=11;
		
		int count=0;
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("given number is pprime number");
		}
		else
		{
			System.out.println("given number is not a prime number");
		}
	}

}
