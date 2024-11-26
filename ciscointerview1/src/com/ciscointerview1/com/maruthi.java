package com.ciscointerview1.com;

public class maruthi implements Car {

	@Override
	public void drive() {
		System.out.println("drive the car");
		
	}

	@Override
	public void breaking() {
		System.out.println("break the car");
		
	}

	@Override
	public void opendoor() {
		System.out.println("open the door of the car");		
	}

	@Override
	public void Start() {
		System.out.println("start the car");
		
	}
	
	public static void main(String [] args)
	{
		maruthi m = new maruthi();
		m.breaking();m.drive();
		m.Start();m.opendoor();
			
	}
}
