package Projects;

public class ExceptionHandling {
	public static void main(String [] args)
	{
		int a =10;
		int b=0;
		int result =0;
		System.out.println("pogram started");
		
	try {
		result = a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.toString());
	}
	finally
	{
		System.out.println("code done ");
	}
	
	System.out.println(result);
	}

}
