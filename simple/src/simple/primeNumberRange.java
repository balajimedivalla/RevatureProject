package simple;

public class primeNumberRange {
	public static void main(String args)
	{
		for(int a=20; a<=50; a++)
		{
			int count =0;
			for(int i=2; i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a);
			}
		}
		
	}

}
