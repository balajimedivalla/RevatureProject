package com.ciscointerview1.com;

public class StringOwels {
	public static void main(String [] args)
	{
		String s= "bljft";
		
		char[] ch = s.toCharArray();
		boolean flag= false;
		
		for(char c :ch)
		{
			if(c == 'A' || c=='a' || c=='E' || c=='e' ||
					c== 'I' || c=='i' || c=='o' || c=='O'
					|| c=='u' ||  c =='U')
			{
				char b = c;
				System.out.println(b);
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("no elemenets found");
		}
		
	}

}
