package Projects;
import java.lang.reflect.Array;
import java.util.*;
public class SecondLargestArray {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the array size");
		int n =sc.nextInt();
		int temp1=0;
		int [] array1= new int[n];
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		
		System.out.println("enter the array");
		for(int i=0; i<n; i++)
		{
			array1[i]= sc.nextInt(); //45 34 56
		}
//		for(int i=0; i<array1.length-1; i++)
//		{
//			for(int j=0;j<array1.length-1-i;j++)
//			{
//				if(array1[j]>array1[j+1])
//				{
//					int temp = array1[j];
//					array1[j]=array1[j+1];
//					array1[j+1]=temp;
//				}
//			}
//		}
		int n1=Array.getLength(array1);
		Arrays.sort(array1);
		//System.out.println("after sorting"+Arrays.toString(array1));
		
		for(int i=array1.length-1; i>=0; i--)
		{	     
			//int j=0;
			//arr2[j++]=array1[i];
			//System.out.print(array1[i]);
			
		}
		for(int j=0;j<arr2.length;j++)
		{
			arr2[j]=array1[array1.length-1-j];
		}
		System.out.print(arr2[1]);
	}	

}