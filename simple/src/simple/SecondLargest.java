package simple;

public class SecondLargest {
	public static void main(String[] args)
	{
		int [] array= {10,20,30,40,50,60};
		
		for(int i=0; i<array.length-1; i++)
		{
			for(int j=0; j<array.length-1; j++)
			{
				if(array[j]< array[j+1])
				{
					int temp=array[j];
					array[j]= array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println(array[1]);
	}

}
