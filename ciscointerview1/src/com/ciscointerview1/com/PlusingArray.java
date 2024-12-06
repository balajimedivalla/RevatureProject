package com.ciscointerview1.com;

import java.util.ArrayList;

public class PlusingArray {
	public static void main(String[] args)
	{
		int[] array1= {10,20,30,40,50,60};
		int [] array2= {70,80};
		
		ArrayList<Integer> a= new ArrayList<>();
		
		for(Integer k:array1)
		{
			a.add(k);
		}
		for(Integer l :array2)
		{
			a.add(l);
		}
		System.out.println(a);
		
	}

}
