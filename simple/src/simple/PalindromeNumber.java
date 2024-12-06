package simple;

public class PalindromeNumber {
	public static void main(String [] args)
	{
		int a=434;
		int b=a;
		int rev=0;
		
		while(a>0)
		{
			int rem= a%10;
			rev= rev*10+rem;
			a=a/10;
		}
		System.out.println(rev);
		
		if(rev==b)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("give number is not a palindrome");
		}
	}

}
