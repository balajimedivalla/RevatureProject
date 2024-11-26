package Projects;

public class AnagramNumber {
	public static void main(String[]args)
	{
		int a =234;
		int k=a;
		int count=0;
		int sum=0;
		while(a>0)
		{	a=a/10;
			count++;
			
		}
		a=k;
		
		while(a>0)
		{
			int rem =a%10;
			sum = sum+(int)Math.pow(rem, count);
			a=a/10;
		}
		if(sum==k)
		{
			System.out.println("given number is a anagram");
		}
		else
		{
			System.out.println("given number is not a anaagram");
		}
	}

}
