package simple;

public class YearLeap {
	public static void main(String [] args)
	{
		int year =2000;
		
		if(year%4==0 && year%100!=0)
		{
			System.out.println("given year is leap year ");
		}
		else
		{
			System.out.println("given year not a leap year");
		}
	}

}
