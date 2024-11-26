package ArrayLists;
import java.util.*;

public class MapExample {
	
	public static void main(String [] args)
	
	{
		Map k= new HashMap();
		
		k.put(517429, "ragimanupenta");
		
		k.put(560100, "electronic city");
		
		k.put(517520, "renigunta");
		
		System.out.println(k);
		
		
		Collection<String> values=k.values();
		
		for(String val :values)
		{
			System.out.println(val );
		}
		
		Set<Integer> m = k.keySet();
		
		for(Integer keys:m)
		{
			System.out.println(keys);
		}
	}

}
