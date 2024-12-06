package simple;

public class OccurancesString {
	public static void main(String[] args)
	{
		String s="Balaji";
		char c='a';
		int count=0;
		
		for(int i=0; i<s.length();i++)
		{
			char ch= s.charAt(i);
			if(ch== c)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
