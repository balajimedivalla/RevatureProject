package com.ciscointerview1.com;

public class Fibanocisseries {
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		
		
		for(int i=2; i<=10; i++)
		{
			int sum = a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}

}
