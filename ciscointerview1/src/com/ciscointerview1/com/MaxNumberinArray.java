package com.ciscointerview1.com;

public class MaxNumberinArray {
		public static void main(String [] args)
		{
			int [] a= {10,20,30,40,50};
			int arraymax= a[0];
			
			for(int i=0; i<a.length; i++)
			{
				if(a[i] >arraymax)
				{
					arraymax=a[i];
				}
			}
			System.out.println(arraymax);
		}
}
