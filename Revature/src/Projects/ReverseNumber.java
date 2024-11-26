package Projects;

public class ReverseNumber {
	public static void main(String[]args)
	{
		int b=121;
		int temp=b;
		int rem=0;
		int rev=0;
		
		while(b>0)
		{
			rev = rev*10+b%10;
			
			b=b/10;
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("given number is palindrom");
		}
		else 
		{
			System.out.println("given number is nit a palindrome");
		}
	}

}
