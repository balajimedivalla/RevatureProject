package ArrayLists;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class JavaStreamApi {
	public static void main(String []args)
	{
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Balaji");
		al.add("pavan");
		al.add("praveen");
		al.add("ajith");
		
		ArrayList<String> streamResult = (ArrayList<String>) al.stream()
				.filter(s -> s.startsWith("B"))
				.map(String:: toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(streamResult);
				
		
	}

}
