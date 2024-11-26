package oops;


class sing{
	void eat()
	{
		System.out.println("\"animlas are eating\"");
	}
	void bark()
	{
		System.out.println("animals can bark");
	}
}
class dog extends sing
{	void waring()
	{
	System.out.println("dog can make waring for us");
	}
	void smell()
	{
		System.out.println("dog can smell anyhtinh");
	}

}
class catt extends dog
{
	void frined()
	{
		System.out.println("cat and dog are frineds");
	}
}
public class ExMultilevel {
	public static void main(String[] args)
	{
		catt c = new catt();
		c.bark();c.frined();
		
	}
}
