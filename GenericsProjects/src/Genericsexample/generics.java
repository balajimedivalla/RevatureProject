package Genericsexample;


class hero <T>
{
		
		private T value;
		
		
		public void setvalue(T value)
		{
			this.value=value;
		}
		public T get ()
		{
			return value;
		}
}
public class generics 
{
	public static void main(String[]args)
	{
		hero<Integer> h= new hero<>();
		
		h.setvalue(12);
		
		System.out.println(h.get());
		hero<String> i = new hero<>();
		i.setvalue("Balaji");
		System.out.println(i.get());
		
		hero<Object> k= new hero();
		k.setvalue(12);
		k.setvalue("hero india");
		System.out.println(k.get());
		
	}
}
