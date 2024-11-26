package ArrayLists;
import java.util.*;
import java.util.stream.Collectors;
public class NewStreamApi {
		public static void main(String [] args)
		{
			
			
			List<String> mp= new LinkedList<>();
			
			mp.add( "balaji");
			mp.add("pavan");
			
			mp.add( "praveen");
			
			mp.add( null);
			
			List<String> StreamdResult = (List<String>) mp.stream()
					.filter(k -> k != null)
					
					.collect(Collectors.toList());
					
					System.out.println(StreamdResult);
					
					
		}
}
