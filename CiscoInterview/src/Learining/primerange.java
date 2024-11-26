package Learining;

public class primerange {
	public static void main(String[]args)
	{
		for (int a=30; a<=70; a++)
		{
			int count=0;
			
			for(int i=2; i<a; i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a +" is peimr number");
			}
		}
		
	}

}
