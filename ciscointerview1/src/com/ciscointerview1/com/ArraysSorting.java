package com.ciscointerview1.com;

import java.util.Arrays;

public class ArraysSorting {
	public static void main(String[] args)
	{
		int [] array1= {10,50,20,40,20};
		
		for(int i=0; i<array1.length-1; i++)
		{
			for(int j=0; j<array1.length-1-i; j++)
			{
				if(array1[j]> array1[j+1])
				{
					int temp = array1[j];
					array1[j]= array1[j+1];
					array1[j+1]= temp;
					
			}			}
		}
		System.out.println(Arrays.toString(array1));
	}
	
}
