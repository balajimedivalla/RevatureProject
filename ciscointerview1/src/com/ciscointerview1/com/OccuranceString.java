package com.ciscointerview1.com;

public class OccuranceString {
	public static void main(String [] args)
	{
		String s = "balaji";
		int count =0;
		char c='a';
		
		for(int i =0; i<=s.length()-1; i++)
		{
			char ch= s.charAt(i);
			if(ch==c)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
