package simple;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args)
	{
		int [] array= {40,30,10,20};
		
		for(int i=0; i<array.length-1;i++)
		{
			for(int j=0; j<array.length-1; j++)
			{
				if(array[j]> array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
