package com.ciscointerview1.com;

public class Bharath{
	
	int a;
	int b;
	void add()
	{
		System.out.println(a+b);
	}
	void mull()
	{
		System.out.println(a*b);
	}
	void sub()
	{
		System.out.println(a-b);
	}
	
	
	public static void main(String[] args)
	{
		Bharath b= new Bharath();
		b.a=4;
		b.b=5;
		b.add();
		b.mull();
		
	}
}
