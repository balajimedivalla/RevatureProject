package com.ciscointerview1.com;

import java.util.Arrays;

public class SecondLargestArray {
	public static void main(String[] args)
	{			
		int [] array= {10,40,20,45,50};
		
		for(int i=0; i<array.length-1; i++)
		{
			for(int j=0; j<array.length-1-i; j++)
			{
				if(array[j]< array[j+1])
				{
					int temp = array[j];
					array[j]= array[j+1];
					array[j+1]= temp;
				}
			}
		}
		System.out.println((array[1]));
	}

}
