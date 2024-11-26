package Projects;

public class AramStrong {
	
	public static void main(String [] args)
	{
		int num=153;
		int b=num;
		int count =0;
		int sum =0;
		while(num>0)
		{
			
			num =num/10;
			 count++;
			
		}
		while (num>0)
		{
			int digit = num%10;
			num=num/10;
			sum = sum+(int)Math.pow(digit, count);
		}
		if(sum==num)
		{
			System.out.println("given number is aram stroong");
		}
		else
		{
			System.out.println("given number is not a aram strong");
		}
		
	}}
