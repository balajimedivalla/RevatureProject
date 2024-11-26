package JDBCLEARING;


//Create a Java Dynamic Web application to interact with MySQL database and do a CRUD operation on the given entity. Create a Table in MySQL with a name Employee and with following properties.
//Id – Number (Auto Increment)
//Name – varchar(255)
//Email – varchar(255)
//Mobile – number (10)
// 
//Use JDBC api to interact with MySQL. (/Servlet/your choice)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Tech_M {
	public static void main(String[] args)
	{
		final String username="root";
		final String password="root";
		final String url="jdbc:mysql://localhost:3306/userdb?useSSL=false";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt= con.createStatement();
			
		}
		
		}

}
