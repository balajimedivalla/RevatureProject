package Projects;

public class ReverseString {
	public static void main(String[] args)
	{
		String b="Balaji";
		String rev="";
		for(int i=b.length()-1; i>=0; i--)
		{
			rev = rev+b.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(b))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not a apaliindrome");
		}
	}

}
