package Projects;

public class AnagramString {
	public static void main(String [] args)
	{
		String s= "cat";
		String a ="act";
		int sum =0;
		
		if(s.length()!=a.length())
		{
			System.out.println("given String is not a angram");
			return;
			
		}
		
		for(int i=0; i<s.length(); i++)
		{
			 sum += s.charAt(i);
			 sum -=a.charAt(i);
			 
			
		}
		 System.out.println("given string is anagram");
		if(sum!=0)
		{
			System.out.println("given string is not a anagaram");
		}
		
	}

}
