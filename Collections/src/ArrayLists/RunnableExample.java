package ArrayLists;

public class RunnableExample{

	
	public static void main(String []args)
	{
		hero h= new hero(); //created instances for class 
		
		Thread t1 = new Thread(h);
		t1.start();
		
		
	}
	

}

class hero implements Runnable
{

	@Override
	public void run() {
		System.out.println("thread is runnning");
		
	}
	
}
