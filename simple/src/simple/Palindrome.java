package simple;

public class Palindrome {
	public static void main(String[] args)
	{
			String s="aba";
			String rev="";
			
			for(int i=s.length()-1; i>=0; i--)
			{
				rev= rev+s.charAt(i);
			}
			System.out.println("given string revserse is " + rev);
			if(rev.equals(s))
			{
				System.out.println(" String is Palindrome");
				
			}else
			{
				System.out.println("given String is not a palindrome");
			}
	}

}
