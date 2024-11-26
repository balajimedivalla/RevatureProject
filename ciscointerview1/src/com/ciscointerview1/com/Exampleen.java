package com.ciscointerview1.com;

public class Exampleen {
	
	private int c;
	private int d;
	private void add() {
	}
	private void mull() {
		
	}

	public void setdata(int a, int b)
	{
		c= a+b;
		
	}
	public void setmull(int a , int b)
	{
			d= a*b;
		
	}
	public int getdata()
	{
		return c;
	}
	public int getmull()
	{
		return d;
	}
	
	public static void main(String [] args)
	{
		Exampleen b= new Exampleen();
		b.setdata(10, 20);
		b.setmull(10, 10);
		System.out.println("SUM IS "+b.getdata());
		System.out.println("Product "+b.getmull());
	}
}
