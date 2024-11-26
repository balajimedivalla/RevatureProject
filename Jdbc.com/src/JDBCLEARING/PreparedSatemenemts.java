package JDBCLEARING;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.*;
public class PreparedSatemenemts
{
	private static String  server_link= "jdbc:mysql://localhost:3306/revatur?useSSL=false";
	private static String user_name="root";
	private static String Password ="root";
	 private static String Driver_Register="com.mysql.jdbc.Driver";
	public static void main(String [] args)
	{	Scanner sc = new Scanner(System.in);
			Connection con =null;
			PreparedStatement stmt=null;
		try
		{
		
		Class.forName(Driver_Register);
		 con = DriverManager.getConnection(server_link,user_name,Password);
		String sqlTable ="CREATE TABLE IF NOT EXISTS manga(" +
                "id INT PRIMARY KEY," + "username VARCHAR(50), " +
                "password VARCHAR(50)" +
                ")";
			stmt  = con.prepareStatement(sqlTable);
			stmt.executeUpdate(sqlTable);
			System.out.println("enter the id values ");
			int id = sc.nextInt();
			System.out.println("enter the username");
			String username= sc.next();
			
			System.out.println("enter the password");
			String password = sc.next();
			String sqlInsert = "INSERT INTO users (id, username, password) VALUES (?, ?, ?)";
			stmt = con.prepareStatement(sqlInsert);
			stmt.setInt(1, id);
			stmt.setString(2, username);
			stmt.setString(3, password);
			stmt.executeUpdate();
			
			
			String SqlSelect = "select * from users;";
			
			ResultSet res = stmt.executeQuery(SqlSelect);
			
			System.out.println("ID    | Username          | Password");
			System.out.println("--------------------------------------");
			while(res.next())
			{
				 id = res.getInt("id");
				 username=res.getString("username");
				 password= res.getString("password");
				 System.out.println(id + " | " + username + " | " + password);

			}
			con.close();
			stmt.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

	
