package oops;
interface cat
{
	void drink();	
}

interface  canswim
{
	void swim();
}
class student
{
	void read() {
		System.out.println("Student can Read");
	}
}

class Teacher extends student implements cat
{
	public void drink() {
		System.out.println("student can drink");		
	}	
}
class Prinicipal extends Teacher  implements canswim
{

	@Override
	public void swim() {
		System.out.println("Any one can swim");	
	}
	
}
public class HybridInheritance {
	public static void main(String [] args)
	{
		Prinicipal p = new Prinicipal();
		p.swim();
		p.drink();
		
	}

}
