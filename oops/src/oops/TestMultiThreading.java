package oops;

public class TestMultiThreading {
	static public void main(String [] args)
	{	
		System.out.println("hellow world");
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		
	}
}
