package com.ciscointerview1.com;

public class Tayoto implements Car {

	@Override
	public void drive() {
		System.out.println("drive the car");
		
	}

	@Override
	public void breaking() {
		System.out.println("brak the car");
		
	}

	@Override
	public void opendoor() {
		System.out.println("open the car door");
		
	}

	@Override
	public void Start() {
		System.out.println("start the car");
		
	}
	public static void main(String [] args)
	{
		Tayoto n = new Tayoto();
		n.breaking();
		n.opendoor();
	}
}
