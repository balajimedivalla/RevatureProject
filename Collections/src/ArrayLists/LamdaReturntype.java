package ArrayLists;

public class LamdaReturntype {
	public static void main(String [] args)
	{
		maruthi maru= new maruthi();
		int speed =maru.getspeed(50, "india");
		System.out.println("sopeed is "+ speed);
//lamda expression with  caru intercae we can say anyomous interfcae
		caru l= (a,b) -> {
						if(a>100)
							System.out.println("car is getting more speed ");
						else
							System.out.println("car is goin to smotthly");	
			
						return a;
				};
				
				int lambdaSpeed = l.getspeed(50, "BMW");
				System.out.println(lambdaSpeed);
	}

}

class maruthi implements caru
{

	@Override
	public int getspeed(int a , String b) {
		System.out.println("spped is "+a+"so sthe speed of the cars id getting more" );
		
		return a;
	}
	
}

interface caru
{
	public int getspeed(int a, String b);
}