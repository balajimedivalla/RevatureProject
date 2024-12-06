package simple;

public class StringReplcment {
	public static void main(String[] args)
	{
		String s= "Balaji";
		char ch='a';
		char c='k';
		StringBuilder l= new StringBuilder();
		for(int i=0; i<s.length();i++)
		{
			char j=s.charAt(i);
			if(j==ch)
			{
				l.append(c);
			}
			else
			{
				l.append(j);
			}
			
		}
		System.out.println(l.toString());
	}

}
