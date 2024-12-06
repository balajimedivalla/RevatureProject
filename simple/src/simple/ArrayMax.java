package simple;

public class ArrayMax {
	public static void main(String[] args)
	{
		int [] array= {10,30,20,30,50};
		int arraymax=array[0];
		for(int i=0; i<array.length;i++)
		{
			if(array[i]> arraymax)
			{
				arraymax=array[i];
			}
		}
		System.out.println(arraymax);
	}

}
