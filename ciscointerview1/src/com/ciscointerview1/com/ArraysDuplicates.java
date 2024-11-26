package com.ciscointerview1.com;

import java.util.Scanner;

public class ArraysDuplicates {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the given arrays size");
		int b= sc.nextInt();
		int [] arrays= new int[b];	
		System.out.println("enyter the give array");
		
		for(int i=0; i<b; i++)
		{
			 arrays[i]= sc.nextInt();
		}
		boolean flag=false;
		for(int i=0; i< arrays.length; i++)
		{
			for(int j=i+1; j<arrays.length; j++)
			{
				if(arrays[i]== arrays[j])
				{
					System.out.println(arrays[i]);
					flag= true;
					break;
				}
							
			}
		}
		if(!flag)
		{
			System.out.println("no duplicates found");
		}
	}
}
