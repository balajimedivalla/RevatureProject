package Projects;

public class OccuranceString {
	public static void main(String[] args)
	{
		String s="balaji";
		char ch = 'b';
		int count =0;
		
		for(int i=0; i<s.length(); i++)
		{
			char chh= s.charAt(i);
			if(chh==ch)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
