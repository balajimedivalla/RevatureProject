package ArrayLists;

import java.util.TreeSet;

public class SortingArray {
	public static void main(String[] args) {
		char [] ch= { 'a','b','c','d','z','k','m','M'};
		
		TreeSet<Character> array= new TreeSet<>();
		
		for(char c: ch) {
            array.add(c);
        }
		System.out.println(array);
	}

} 
