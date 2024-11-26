package Projects;
import java.util.*;
public class Stringadding {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string");;
		String s= sc.nextLine();
		System.out.println("Enter the second String");
		String l =sc.nextLine();	
		String temp="";
		for(int i=0; i<s.length(); i++ )
		{
			char ch= s.charAt(i);
			temp = temp+ch;
		}
																																																		
		for(int i=0; i<l.length();i++)
		{
			char c=l.charAt(i);
			temp+= c;
		}
		System.out.println(temp);
		
	}

}
