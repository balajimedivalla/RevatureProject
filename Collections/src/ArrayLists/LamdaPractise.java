package ArrayLists;

public class LamdaPractise {
	public static void main(String [] args)
	{
		Tata t = new Tata();
		t.drive(10,"balaji");
		System.out.println();
		
		//Lambda expression for anonymous class 
		car k = (a,b) -> {System.out.println("very good perffect");
			k.drive(30, "india");
				};
	}
class Tata implements car
{
	@Override
	public void drive(int a ,String c) {
	System.out.println("tata cars are so good");	
	}
	
}
interface car
{
	public void drive(int a, String b);
}
}