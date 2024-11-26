package Maincode;

public class Demoo 
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public String Equals(String s, String b)
	{
		if(s.equals(b))
		{
			return s;
		}
		return null;
	}

	public int mull(int e ,int d)
	{
		return e*d;
	}
	public int sub(int a , int b)
	{
		return a/b;
	}
	public String CharEqual(String b)
	{	String temp="";
		for(int i=0; i<b.length(); i++)
		{	char c= 'b';
			
			char ch= b.charAt(i);
			if(ch== c)
			{
				temp +=ch;
			}
		}
		return temp;
	}

}
	

