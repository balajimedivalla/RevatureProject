package com.ciscointerview1.com;

public class methodOverloadingexample {
	public static void main(String [] args)
	{
		addition a= new addition();
		System.out.println(a.add(10, 20, 30));
		System.out.println(a.sub(5, 3));
	}

}
class addition
{
	 int add(int a, int b, int c )
	 {
		 return a+b+c;
	 }
	 int sub(int a, int b)
	 {
		 return a-b;
	 }
}