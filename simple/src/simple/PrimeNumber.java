package simple;

public class PrimeNumber {
	public static void main(String [] args)
	{
		int a=3;
		int count=0;
		for(int i=1; i<=3; i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("given number is prime number");
		}
		else
		{
			System.out.println("Given number is not a prime number");
		}
	}

}
