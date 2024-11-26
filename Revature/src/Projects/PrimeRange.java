package Projects;

public class PrimeRange {
	public static void main(String [] args)
	{
		int lowcount=10;
		int hb=20;
		for(int num=lowcount; num<=hb; num++)
		{
			boolean isprim=true;
			
			if(num<=1)
			{
				isprim=false;
			}
			else
			{
				for(int i=2;i<=num/2; i++)
				{
					if(num%i==0)
					{
						isprim= false;
						break;
					}
			}
			}
			if(isprim)
			{
				System.out.println(num);
			}
		}
		
		
		
	}

}
