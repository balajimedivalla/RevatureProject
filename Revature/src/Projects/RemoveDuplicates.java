
package Projects;

public class RemoveDuplicates {
	public static void main(String [] args)
	{
		int [] array1= {10,20,30,50};
		int [] Array1= {10,40,50};
	//	int [] Array2 = new int [array1.length+ Array1.length];
		
		boolean flag = false;
		for(int i=0; i<array1.length; i++)
		{
			for(int j=0; j<Array1.length; j++)
			{
				if(array1[i]== Array1[j])
				{
					System.out.println(array1[i]);
					flag= true;
					break;
				}
			}
		}		
		if(!flag)
		{
			System.out.println("no elements found");
		}
	}
}