package ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	public String name;
	public int id;
	public int Roolnumber;
	
	
	public Student(String name, int id, int Roolnumber)
	{
		this.name= name;
		this.id= id;
		this.Roolnumber= Roolnumber;
	}
	
	public String getname()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}
	public int getRoolnumber()
	{
		return Roolnumber;
	}

	@Override
	public int compareTo(Student o) {
		if(this.id == o.id)
			return 0;
		else if(this.id >o.id)
			return 1;
		else
		return -1;
	}
	
	public static void main (String [] ags)
	{	
	
		List<Student> k= new ArrayList();
		
		k.add(new Student("balaji",21,201));
		k.add(new Student("pavan",22, 205));
		k.add(new Student ("praveen",56,204));
		k.add(new Student ("praneeth",04,107));
		
		for(Student li :k)
		{
			System.out.println(li.id);
		}
		Collections.sort(k);
		
		for(Student l :k)
			System.out.println(l.id);
	}
}

