package Projects;

public class HybridInheritances {
	public static void main(String [] args)
	{
		goat g = new goat();
		g.move();
		g.sound();
	}
}

 interface move
{
	void move();
}
 interface animal
{
	void sound();
}
class goat implements  move, animal
{

	@Override
	public void sound() {
		System.out.println("make sound");
		
	}

	@Override
	public void move() {
		System.out.println("move to next step");
		
	}
	
}


