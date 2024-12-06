package simple;

import java.util.HashSet;

public class ArrayDuplicates {
	public static void main(String[] args)
	{
		int [] array= {10,20,30,40,40,40,40,40,50,50,50};
		
		boolean flag= false;
		int count=0;
		HashSet<Integer>a= new HashSet<>();
		
		for(int i=0; i<array.length; i++)
		{
			for (int j=i+1; j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					
					a.add(array[i]);
					flag=true;
					break;
				}
			}
		}
		System.out.println(count);
		if(!flag)
		{
			System.out.println("no duplicates are fpound");
		}
		else
		{
			System.out.println("duplicates elements are "+ a);
		}
	}
}
