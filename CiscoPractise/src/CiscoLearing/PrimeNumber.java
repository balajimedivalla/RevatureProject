package CiscoLearing;

public class PrimeNumber {
	public static void main(String[]args)
	{
		int a =23;
		int count=0;
		
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("given number is a prime number");
		}
		else
		{
			System.out.println("given numer is not  prime number");
		}
		
	}

}
