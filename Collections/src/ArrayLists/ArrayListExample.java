package ArrayLists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListExample {


static public void main(String[] args)
{
	HashSet<String>a1= new HashSet();
	
	a1.add("balaji");
	a1.add("balaji");
	a1.add(null);
	a1.remove("balaji");
	System.out.println(a1);
	
	
	LinkedHashSet<String> a2 = new LinkedHashSet();
	a2.add(null);
	a2.add("tabbu");
	
	//System.out.println(a2);
	
	TreeSet<Integer> a3=new TreeSet();
	a3.add(10);
a3.add(20);
a3.add(15);
	//System.out.println(a3);
	
	TreeSet<String> a5=new TreeSet();
	a5.add("america");
	a5.add("delhi");
	a5.add("hyderabad");
	boolean y= a5.contains("delhi");
	//System.out.println(y);
	TreeSet<Integer> a9=new TreeSet();
	a9.add(20);
	a9.add(30);
	a9.add(3);
	a9.add(6);
	System.out.println(a9);
	
	//a1={10,20,30,40,},a2={50,15,25,}
	TreeSet <Integer> a7=new TreeSet();
	a7.add(10);
	a7.add(20);
	a7.add(30);
	a7.add(40);
	Set <Integer> a8=new TreeSet();
	a8.add(50);
	a8.add(60);
	a8.add(70);
	a8.add(80);
	a7.addAll(a8);
	int a=a7.size();
	System.out.println(a7);
	int index = 0;
    for (Integer element : a7) {
        if (index % 2 == 0) { // Checking if the index is even
            System.out.println("Element at even index: " + element);
        }
        index++;
    }
    int []array= {90,403,20,30,10,};
    
    ArrayList<Integer> india= new ArrayList<Integer>();
    
    for(int b : array)
    {
    	india.add(b);
    }
    System.out.println(india);
    
    

   }

}

	

	
	

   
	
	
	
	
	
	
	
	
	
