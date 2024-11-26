package JDBCLEARING;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class NewLearining {
	public static void main(String [] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			// get connection
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revatur?useSSL=false","root","root");
			Statement stmn = con.createStatement();
			stmn.executeUpdate("drop table Reavture");
			stmn.executeUpdate("create table Reavture (id int, name varchar(20))");
			stmn.executeUpdate("insert into Reavture values(1,'praneeth')");
			stmn.executeUpdate("insert into reavture values(2,'sanjana')");
			System.out.println("id   name  ");
			ResultSet rev = stmn.executeQuery("Select * from Reavture");
			
			while (rev.next())
			{
				System.out.println(rev.getInt("id") +"   " + rev.getString("name"));
			}
			
			con.close();
		}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}