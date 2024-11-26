package com.ciscointerview1.com;

public interface CountString {
	public static void main(String[] args)
	{
		String s="indiagdf";
		
		int count=0;
		
		for(int i=0; i<s.length();i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
