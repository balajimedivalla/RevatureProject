package com.ciscointerview1.com;

public class HybridInheritances extends students implements teacher, principle{

	@Override
	public void control() {
		System.out.println("principle can control college");
	}
	@Override
	public void teach() {
		System.out.println("teacher can make students as proud");
	}
	public static void main(String[] args)
	{
		HybridInheritances v= new HybridInheritances();
		v.control();
		v.teach();
		v.sound();
	}

}
class students
{
	void sound()
	{
		System.out.println("students can make sound");
	}
}

interface teacher
{
	void teach();
}

interface principle
{
	void control();
}