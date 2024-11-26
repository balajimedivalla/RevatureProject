package Projects;

public class Fibonicsseries {
	public static void main(String [] args)
	{    int n=10;
		int a=0; int b=1;
		System.out.println(a+" "+b);
		for(int i=1; i<n; i++)
		{
			int c =a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
