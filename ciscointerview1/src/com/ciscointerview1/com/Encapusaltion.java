package com.ciscointerview1.com;


public class Encapusaltion
{
	public static void main(String[] args)
	{
		Encapusaltionn n= new Encapusaltionn();
		n.setAge(24);
		n.setname("Balaji");	
		System.out.println(n.getname() +" "+ n.getAge());
	}
}
class Encapusaltionn {
	private String name;
	
	private int age ;
	
	
	public Encapusaltionn()
	{
	}
	
	public void setname(String name)
	{		this.name= name;
		
	}
	public String getname()
	{
		return name;
	}
	
    public void setAge(int age)
    {
    	this.age=age;
    }
    public int getAge()
    {
    	return age;
    }

}
