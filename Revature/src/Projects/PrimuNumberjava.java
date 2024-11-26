package Projects;

public class PrimuNumberjava {
	public static void main(String[]args)
	{
		int r=7;
		int count=0;
		for(int i=1; i<=r; i++)
		{
			if(r%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("given number is primme");
		}
		else
		{
			System.out.println("given number is not prime");
		}
	}

}
