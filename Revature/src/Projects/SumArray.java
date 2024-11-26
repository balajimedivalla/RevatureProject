package Projects;

public class SumArray {
	public static void main (String[] args)
	{
		int array[]= {1,2,3,4,5,6,7};
		int temp =13;
		for(int i=0; i<array.length-1;i++)
		{
			if(array[i+1]==temp- array[i])
			{
				System.out.println(array[i]+" "+array[i+1]);
			}
		}
}
}
//stirn in reverse