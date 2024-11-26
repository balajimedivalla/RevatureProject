package Projects;
import java.util.*;
public class Arrayelement {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size");
		int n = sc.nextInt();
		int array1[] = new int[n];
		System.out.println("enter the array elements");
		for(int i=0; i<n; i++)
		{
			array1[i]= sc.nextInt();
		}
		System.out.println("enter the array2 size");
		int m = sc.nextInt();
		int array2[]= new int[m];
		System.out.println("enter the array elements");
		for(int i=0; i<m; i++)
		{
			array2[i]= sc.nextInt();
		}
		int totalSum=0;
		int sumArray1 = 0;
        for(int i = 0; i < n; i++) {
            sumArray1 += array1[i];
        }

        int sumArray2 = 0;
        for(int i = 0; i < m; i++) {
            sumArray2 += array2[i];
        }

         totalSum = sumArray1 + sumArray2;
        
        System.out.println(totalSum);
		
	}

}
