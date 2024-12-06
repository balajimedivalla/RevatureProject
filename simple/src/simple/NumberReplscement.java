package simple;

public class NumberReplscement {
		public static void main(String [] args)
		{
			int a=321;
			int b=1; int c=9;
			StringBuilder s= new StringBuilder();
			while(a>0)
			{
				int rem= a%10;
				if(rem==b)
				{
					s.append(c);
				}
				else
				{
					s.append(rem);
				}
				a=a/10;
			}
			s.reverse();
			System.out.println(s);
		}
}
