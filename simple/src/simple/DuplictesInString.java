	package simple;

import java.util.HashSet;
import java.util.Set;
public class DuplictesInString {
		public static void main(String[] args)
		{
			String K="Balaji";
			StringBuilder m= new StringBuilder();
		    Set<Character> seen = new HashSet<>();
		    for(char c:K.toCharArray())
		    {
		    	if(seen.contains(c))
		    	{
		    		m.append(c);
		    	}
		    	else
		    	{
		    		seen.add(c);
		    	}
		    }
		    System.out.println(seen.toString());
		}
	}
