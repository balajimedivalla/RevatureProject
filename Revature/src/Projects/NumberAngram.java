package Projects;

public class NumberAngram {
	
	public static void main(String[] args)
	{
		int a=123;
		int b=321;
		int tempa=a;
		int tempb=b;
		int rem=0;
		
		int [] counta= new int[10];
		int []count1=new int[10];
		while(tempa>0)
		{ rem= tempa%10;
		counta[rem]++;
		tempa=tempa/10;
		}
		while (tempb>0)
		{rem=tempb%10;
			count1[rem]++;
			tempb= tempb/10;
		}
		boolean isanagram= true;
		for(int i=0; i<10; i++)
		{
			if(counta[rem]!= count1[rem])
			{
				isanagram =false;
				break;
			}
		}
		if(isanagram)
		{
			System.out.println("given number is anaagram");
		}
		else
		{
			System.out.println("not a anahgram");
		}
	}

}
