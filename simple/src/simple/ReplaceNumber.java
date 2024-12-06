package simple;

public class ReplaceNumber {
	public static void main(String[] args)
	{
		int a=1234;
		int b=4;
		int aa=5;
		StringBuilder s= new StringBuilder();
		while (a>0)
		{
			int rem=a%10;
		
			if(rem==b)
			{
				
				rem=aa;
				s.append(rem);
			}
			else
			{
				s.append(rem);
			}
			a=a/10;	
		}
		s.reverse();
		 System.out.println("Modified number: " + s.toString());
		
	}

}
