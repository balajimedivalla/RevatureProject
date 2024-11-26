package com.ciscointerview1.com;

public class SwappingNumber {
	public static void main(String[] args)
	{
		int a=20;
		int b=30;
		
//		a= a+b;
//		b=a-b;
//		a=a-b;
		
		a= a ^b;
		b = a^b;
		a=a^b;
		
		System.out.println("after swapping number a is "+ a +"and b is "+b);
		
	}

}
