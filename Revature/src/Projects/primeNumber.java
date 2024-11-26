package Projects;

public class primeNumber {
	public static void main(String [] args)
	
	{
		int b = 8;
		int count =0;
		
		
		for(int i=1; i<=b;i++)
		{
			if(b%i==0)
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
			System.out.println("given number is not a prime number");
		}
	}

}
