package Projects;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
public class Demo{
	public static void main(String [] args)
	{
		
		try
		{
			demo de= new demo("Balaji",2);
			
			FileOutputStream Stream = new FileOutputStream("balu.ser");
			ObjectOutputStream sb = new ObjectOutputStream(Stream);
			
			sb.writeObject(de);
			sb.close();
			Stream.close();
			System.out.println("Serilization data is completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}
}
class demo implements Serializable
{
	public String s;
	public int a;
	
	public demo(String s, int a)
	{
		this.s= s;
		this.a=a;
	}
}