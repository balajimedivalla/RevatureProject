package com.ciscointerview1.com;

public class ExampleInheritance {
	

}






class animal
{
	void eat() {
		System.out.println("animal can Eat the food");
	}
	void barking()
	{
		System.out.println("animal can make the barking");
	}
}

class dog extends animal
{
	void bite()
	{
		System.out.println("dog can bite us");
	}
}

class cat extends dog
{
	void meeow()
	{
		System.out.println("cat can make meow");
	}
}