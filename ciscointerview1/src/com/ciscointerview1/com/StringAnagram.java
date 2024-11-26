package com.ciscointerview1.com;

public class StringAnagram {
	public static void main(String [] args)
	{
		String s= "tiesnl";
		String n="Silent";
		int sum=0;
		if(s.length() !=n.length())
		{
			System.out.println("given string is not not a anagaram");
			
			return;
		}
		for(int i=0; i<s.length(); i++)
		{
			sum += s.charAt(i);
			sum -=n.charAt(i);
		}
		if(sum==0)
		{
			System.out.println("given string is anagram");
		}
		else
		{
			System.out.println("given string is not anagram");
		}
	}

}
