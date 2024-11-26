package com.ciscointerview1.com;

public class RevsreseWords {
	public static void main(String [] args)
	{
		String s="Balaji india good";
		
		String a[]= s.split(" ");
		String result="";
		
		for(int i=a.length-1; i>=0; i--)
			{	
				result = result+a[i];
				if (i > 0) {
	                result += " ";
	            }
				
			}
		System.out.println(result );
		
	
	}

}
