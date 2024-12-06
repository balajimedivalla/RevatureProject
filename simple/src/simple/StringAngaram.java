package simple;

public class StringAngaram {
	public static void main(String[] args)
{
	String Str="listen";
	String St= "silent";
	int sum =0;
	
	if(Str.length()!=St.length())
	{
		System.out.println("given Strings are not a anagaram");
		return;
	}
	
	for(int i=0; i<St.length(); i++)
	{
		sum =sum+St.charAt(i);
		sum -=Str.charAt(i);
	}
	if(sum==0)
	{
		System.out.println("anagram String");
	}
	else
	{
		System.out.println("given staring is not a anagram");
	}
}

}
