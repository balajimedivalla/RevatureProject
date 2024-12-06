package simple;

public class HirachicalINheriatances {
	public static void main(String[] args) {
		
	}

}
class herr
{
	void drma()
	{
		System.out.println("Hero can drma");
	}
}
class villan extends herr
{
	void kill()
	
	{
		System.out.println("Villan can kill");
	}
}

class heroVillan extends herr
{
	void superkill()
	{
		System.out.println("Hero villan can superkill");
	}
}
