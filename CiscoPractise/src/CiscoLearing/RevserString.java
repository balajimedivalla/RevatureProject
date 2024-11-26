package CiscoLearing;

public class RevserString {
	public static void main(String[] args)
	{
		String str="Balaji";
		String Str="";
		
		for(int i=str.length()-1; i>=0;i--)
		{
			Str += str.charAt(i);
		}
		System.out.println(Str);
	}
}
