package com.ciscointerview1.com;

import java.util.Arrays;

public class SortingNumber {
	public static void main(String[] args)
	{
		int [] arrays= {20,30,40,20,50};
		
		for(int i=0; i<arrays.length-1; i++)
		{
			for(int j=0; j<arrays.length-1-i; j++)
			{
			if(	arrays[j]> arrays[j+1])
				{
							int temp = arrays[j];
							arrays[j]= arrays[j+1];
							arrays[j+1]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(arrays));
	}

}
