package simple;

public class minArray {
	public static void main(String[] args)
	{
		int[] array= {30,20,10,20,30};
		int minArray=array[0];
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]<minArray)
			{
				minArray=array[i];
			}
		}
		System.out.println(minArray);
	}

}
