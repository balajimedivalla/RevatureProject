package ArrayLists;

import java.util.ArrayList;
import java.util.Map;

public class FirstPogram {
	static public void main(String [] args)
	{
		ArrayList<Object> s= new ArrayList();
		
		s.add(1); s.add(2);
		
		s.add("Balaji");
		s.add(10.2);
		
		
		
		s.set(1,3);
		System.out.println(s);
		
		s.set(2, "pavan");
		System.out.println(s);
		boolean d =s.contains("pavan");
		System.out.println(d);
		System.out.println(s);
		
		
		
	}

}
