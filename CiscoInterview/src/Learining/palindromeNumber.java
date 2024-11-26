package Learining;

public class palindromeNumber {
	public static void main(String [] args)
	{
		int a =456;
		int rev=0;
		while(a>0)
		{
			int rem= a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(rev==a)
		{
			System.out.println("given number is plaindrome");
		}
		else
		{
			System.out.println("given number is not a aplaindrome");
		}
	}

}
