package simple;

public class removeStecialChar {
	public static void main(String [] args)
	
	{
		String s="Balaji@#$";
		StringBuilder k= new StringBuilder();
		StringBuilder m= new StringBuilder();
		for(int i=0; i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				k.append(ch);
			}
			else
			{
				m.append(ch);
			}
		
			
		}
		System.out.println(k);
	}

}
