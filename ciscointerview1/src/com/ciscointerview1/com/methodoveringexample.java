package com.ciscointerview1.com;

public class methodoveringexample {
	public static void main(String [] args)
	{
		home n = new home();
		guesthouse h = new guesthouse();
		
		n.dad();
		h.scold();
		h.dad();
		
	}

}
class home
{
	void dad()
	{
		System.out.println("daddy can make us proud");
	}
}

class guesthouse extends home
{	@override
	void dad()
	{
		System.out.println("dadady can make us proud");
	}
	void scold()
	{
		System.out.println("he can scold the childersns");
	}
}