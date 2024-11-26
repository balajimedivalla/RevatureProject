package com.ciscointerview1.com;

public class singleleevelIngeritance{
	public static void main(String[] args) {
	
	india s = new india();
	s.shot();
	s.action();
	}
}


class hero
{
	 public void action()
	{
		System.out.println("hero will act in mpovies");
	}
}

class india extends hero
{
	public void shot()
	{
		System.out.println("hero cane kame a shot");
	}
}