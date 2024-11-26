package JDBCLEARING;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ciscoLearing {
    public static void main(String[] args) {
        try {
            // Use the correct MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Correct the JDBC connection string to include the port and database name
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revshop", "root", "root");
            
            // Create a statement
            Statement stmt = con.createStatement();
            
            // Correct SQL syntax for creating a table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS bed (id INT, name VARCHAR(20))");
            
            System.out.println("Query executed successfully.");
            
            // Close the connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
