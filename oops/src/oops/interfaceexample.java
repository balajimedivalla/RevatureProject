package oops;

class animal
{
	void eat()
	{
		System.out.println("animlas have four legs");
	}
	void heart()
	{
		System.out.println("animlas has soft heart");
	}
	
}

class balu extends animal {
	void adopt()
	{
		System.out.println("baalu adopt the animals");
	}
	void drink()
	{
		System.out.println("animlas drinking water");
	}
}
public class interfaceexample {
	public static void main(String [] args)
	{
		balu b = new balu();
		b.adopt();b.eat();
		b.heart();
	}

}
