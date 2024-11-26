package Projects;
import java.util.Scanner;

public class ReverArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int [] array= new int[size];
		System.out.println("enter the given array");
		for(int i=0; i<size; i++)
		{
		 array[i]= sc.nextInt();
		}
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.println(array[i]);
		}
	}

}
