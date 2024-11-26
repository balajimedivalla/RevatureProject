package com.ciscointerview1.com;

public class ReplaceLetters {
	public static void main(String[] args)
	{
		String s="Balaji";
		char b='a';
		char c='k';
		
		StringBuilder k= new StringBuilder();
		for(int i=0; i<s.length(); i++)
		{
			char ch= s.charAt(i);
			
			if(ch==b)
			{
				k.append(c);
			}
			else
			{
				k.append(ch);
			}
		}
		System.out.println(k);
	}

}
