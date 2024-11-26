package com.ciscointerview1.com;

import java.util.Scanner;

public class ArraysMerging {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the arrays size");
		
		int b= sc.nextInt();
		int [] arrays = new int[b];
		
		System.out.println("enter the arrays");
		for(int i=0; i<b; i++)
		{
			arrays[i] = sc.nextInt();
			
		}
		System.out.println("Enter the arrays size");
		
		int k= sc.nextInt();
		int [] arrays1 = new int[k];
		
		System.out.println("enter the arrays");
		for(int i=0; i<k; i++)
		{
			arrays1[i] = sc.nextInt();
			
		}
		
		int [] array2= new int[arrays.length+arrays1.length];
		
		for(int i=0; i<arrays.length; i++)
		{
			array2[i]= arrays[i];
		}
		for(int j=0; j<arrays1.length;j++)
		{
			array2[arrays.length+ j]= arrays1[j];
		}
		for(int i=0; i< array2.length; i++)
		{
			System.out.println(array2[i]);
		}
	}

}
