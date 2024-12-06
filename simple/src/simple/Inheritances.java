package simple;

public class Inheritances {
	public static void main(String[] args)
	{
		heroin h= new heroin();
		h.act();
		h.dance();
		h.indance();
	}

}
class hero
{
	void act()
	{
		System.out.println("Hero is acting");
	}
	void dance()
	{
		System.out.println("Hero is dancing");
	}
}

class heroin extends hero
{
	void indance()
	{
		System.out.println("Hero is indancing");
	}
}