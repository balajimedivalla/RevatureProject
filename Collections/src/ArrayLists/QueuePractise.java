package ArrayLists;
import java.util.*;
public class QueuePractise {
	
	public static void main(String [] args)
	{
		Queue<Integer> pq= new PriorityQueue<>();
		// addition , peek , poll
		pq.add(20);
		pq.add(30);
		pq.add(60);
		pq.offer(76);
		pq.add(79);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
