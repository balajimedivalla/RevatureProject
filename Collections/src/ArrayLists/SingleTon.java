package ArrayLists;

public class SingleTon {
	
	public static void main(String []args)
	{
		abc obj1 = abc.getInstance();
		abc obj2 = abc.getInstance();
		 System.out.println(obj1 == obj2); 
	}

	
}
	class abc
	{ static abc k = new abc();
		private abc()
		{
			
		}
	public static abc getInstance()
	{
		return k;
	}
		
	}
