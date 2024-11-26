package ArrayLists;
import java.util.*;
import java.util.Comparator;

public class ComparatorPractise  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		 return Integer.compare(o1.id, o2.id);
	}
	
	public static void main(String [] args)
	{
		ArrayList <Student> pq = new ArrayList<>();
		
		pq.add(new Student("malini", 78, 302));
		
		pq.add(new Student("revature", 23, 678));
		
		Collections.sort(pq,new ComparatorPractise());
		
		for(Student hi :pq)
			System.out.println(hi.id);
	}

}


