package com.ciscointerview1.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ciscojdbc {
	public static void main(String [] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revatur","root", "root");
			Statement stmt = con.createStatement();
			
			String a = ("create table if not exists pooja(id int primary key, name varchar(20)"); 
			stmt.executeUpdate(a);
			System.out.println("table is created");
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
