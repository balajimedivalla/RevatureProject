package simple;

public class StringOwls {
	public static void main(String[] args)
	{
		String s="Balaji";
		int count =0;
		
		StringBuilder B= new StringBuilder();
		StringBuilder A=new StringBuilder();
		for(int i=0; i<s.length(); i++)
		{
			char ch= s.charAt(i);
			if(ch=='A'|| ch=='a' || ch=='E'|| ch== 'e' || ch=='i'|| ch == 'I'||
					ch=='o' || ch=='O' || ch =='u'|| ch=='U')
				
			{
				B.append(ch);
			}
			else
			{
				A.append(ch);
			}
		}
		System.out.println(B);
	}

}
