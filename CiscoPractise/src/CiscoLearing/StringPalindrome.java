package CiscoLearing;

public class StringPalindrome {
		public static void main(String[] args)
		{
			String s="aba";
			String b="";
			
			for(int i=s.length()-1; i>=0; i--)
			{
				b +=s.charAt(i);
			}
		
			if(s.equals(b))
			{
				
				System.out.println("given string is palindrome");
			}
			else
				{
				System.out.println("given string is not a apalindrome");
			}
		}
}
