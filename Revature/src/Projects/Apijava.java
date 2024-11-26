package Projects;

import java.time.LocalDate;
import java.time.LocalTime;

public class Apijava {
	static public  void main(String [] args) throws Exception
	{
		LocalDate t1= LocalDate.now();
		System.out.println(t1);
		LocalTime s2 = LocalTime.now();
		System.out.println(s2);
		LocalDate s3= LocalDate.of(2024, 9, 3);
		System.out.println(s3);
	}

}
