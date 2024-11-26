package JDBCLEARING;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatemnts
{
	public static void main(String [] args)
	{
		try
		{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revatur?useSSL=false","root","root");
		 String qry ="insert into users(username,password) values(?,?)";
		 
		 PreparedStatement stmt= con.prepareStatement(qry);
		 
		 stmt.setString(1,"user4");
		 stmt.setString(2, "password4");
		 
		 stmt.executeUpdate();
		 stmt.setString(1,"user5");
		 stmt.setString(2, "password6");
		 stmt.execute();
		 stmt.setString(1,"user4");
		 stmt.setString(2, "password4");
		 
		 stmt.executeUpdate();
		 stmt.setString(1,"user5");
		 stmt.setString(2, "password6");
		 stmt.execute();
		 System.out.println("query inserted sucssfullu");
		 con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}



