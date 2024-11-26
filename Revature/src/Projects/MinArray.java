package Projects;
import java.util.*;
public class MinArray {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the array size");
		
		int n = sc.nextInt();
		
		int array1[]= new int[n];
		
		System.out.println("enter the array");
		for(int i=0; i<n; i++)
		{
			array1[i] =sc.nextInt();
		}
		
		int min=array1[0];
			for (int i = 1; i < array1.length; i++) 
			{
	            if (array1[i] < min) {
	                min = array1[i];
	            }
		
	}
			System.out.println(min);

}}
