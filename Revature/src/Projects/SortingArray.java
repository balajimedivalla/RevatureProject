package Projects;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args)
	{
		int [] array1= {10,30,40,20};
		
		for(int i=0; i<array1.length-1; i++)
		{
			for(int j=0; j<array1.length-1-i; j++)
			{
				if(array1[j]> array1[j+1])
				{
					int temp = array1[j];
					array1[j]= array1[j+1];
					array1[j+1]= temp;
				}
			}
		}
		System.out.println(" "+ Arrays.toString(array1));
	}

}
