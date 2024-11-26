package ArrayLists;
import java.util.*;
import java.util.stream.Collectors;
public class ApiStream {
	public static void main(String [] args)
	{
		ArrayList<Integer> li = new ArrayList<>();
		
		li.add(12);
		li.add(45);
		li.add(57);
		
		
		ArrayList<Integer> StreamResult= (ArrayList<Integer>) li.stream()
				.filter(i ->(i>20))
				.collect(Collectors.toList());
		
		System.out.println(StreamResult);
		
	}
}
