package simple;

public class ArrayMerging {
	public static void main(String[] args)
	{
		int[] array1= {10,20,30};
		
		int[] array2= {40,50,60};
		int [] array3=new int[ array1.length + array2.length];
		
		for(int i=0; i<array1.length;i++)
		{
			array3[i]=array1[i];
		}
		for(int j=0; j<array2.length; j++)
		{
			array3[array1.length+j]= array2[j];
		}
		for(int k=0; k<array3.length; k++)
		{
			System.out.println(array3[k]);
		}
	}

}
