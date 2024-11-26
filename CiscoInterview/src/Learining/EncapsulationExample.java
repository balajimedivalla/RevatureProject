package Learining;

public class EncapsulationExample {
	public static void main(String [] args)
	{
		hero a = new hero("balaji",20);
		System.out.println("Name: " + a.Getname() + ", Age: " + a.Getage());
	}

}
class hero
{
	private String name;
	private int age;
	
	
	hero(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void Setname(String name)
	{
		
	}
	public String Getname()
	{
		return name;
	}
	public void Setage(int age)
	{
		
	}
	public int Getage()
	{
		return age;
	}
	
}