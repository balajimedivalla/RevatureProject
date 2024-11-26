package JDBCLEARING;

import java.sql.*;

import com.mysql.jdbc.JDBC4ResultSet;

public class NewJdbc {
	
	public static void main(String [] args)
	{
		try
		{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revatur?useSSL=false","root","root");
		 Statement stmt= con.createStatement();
		 
		 
		 
		 stmt.executeUpdate("create table Kannaaa(id int,name varchar(20),adress varchar(20),number bigint)");
		 System.out.println("query executed");
		 stmt.executeUpdate("ALTER TABLE Kannaaa MODIFY COLUMN number VARCHAR(15)");
         System.out.println("Column modified successfully");
		 stmt.executeUpdate("insert into Kannaaa values(1,'pavan','chittoor','9000332073')");
		 stmt.executeUpdate("insert into Kannaaa values(2,'balaji','bangalore','6281091784')");
		 stmt.executeUpdate("insert into Kannaaa values(3, 'rajesh', 'hyderabad', '7896541230')");
		 stmt.executeUpdate("insert into Kannaaa values(4, 'suresh', 'mumbai', '9876543210')");
		 
		 System.out.println("sucessfully inserted");
		 
		 ResultSet res= stmt.executeQuery("select * from Kannaaa where id=2");
		 
		 while(res.next())
		 {
			 System.out.print(res.getInt("ID")+ " "+ res.getString("name")+ " "+
					 res.getString("adress")+" "+res.getString("number"));
			 System.out.println();
		 }
		
		 con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
