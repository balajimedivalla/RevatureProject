package Projects;
import java.util.*;
public class secondarray {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the array size");
		int n = sc.nextInt();
		int [] array= new int[n];
		
		System.out.println("enter the array element");
		for(int i=0; i<n; i++)
		{
			array[i]=sc.nextInt();
			
		}
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.println(array[i]);
		}
		
	}
}
