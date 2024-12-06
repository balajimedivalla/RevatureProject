package simple;

public class MissingNumber {
	public static void main(String[] arags)
	{
		int [] number= {1,2,3,4,5,6,7,8,9,10,11,13};
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<number.length;i++
				) {
			sum1 +=number[i];
		}
		for(int i=1; i<=13; i++)
		{
			sum2 += i;
		}
		
		int missingnumber= sum2-sum1;
		
		System.out.println("missing number is "+ missingnumber);
	}

}
