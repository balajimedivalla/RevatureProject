package Projects;

public class MergingArray {
	
	public static void main(String[] args)
	{
		int [] array1= {10,20,30,40};
		int [] array2= {10,40,50};
		int [] array3 = new int[array1.length+array2.length];
		
		for(int i=0; i<=array1.length-1; i++)
		{
			array3[i] = array1[i];
		}
		for(int j=0; j<=array2.length-1; j++)
		{
			array3[array1.length+j]= array2[j];
		}
		for(int i=0; i<=array3.length-1; i++)
		{
			System.out.print(" "+array3[i]);
		}
	}

}
