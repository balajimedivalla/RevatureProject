package Projects;

public class MultipleExceptions {
	public static void main(String[] args)
	{
		int [] array = new int[4];
		
		try
		{
			array[10] =25;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		int a =array.length;
		
		String s=null;
		
		try
		{
			int b = s.length();
		}
		catch(NullPointerException b)
		{
			System.out.println(b.toString());
		}
		
		System.out.println("ode done");
	}

}

