package Servelets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateEmployeeTableServlet
 */
@WebServlet(name = "CreateEmployeeTable", urlPatterns = { "/CreateEmployeeTable" })
public class CreateEmployeeTableServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // No need to call doGet() here; just handle POST directly
        final String username = "root";
        final String password = "root";
        final String url = "jdbc:mysql://localhost:3306/userdb?useSSL=false";

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the MySQL database
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();

            // SQL query to create the Employeee table if it doesn't exist
            String sql = "CREATE TABLE IF NOT EXISTS Employeee ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(255), "
                    + "email VARCHAR(255), "
                    + "mobile VARCHAR(10))";

            // Execute the update (table creation query)
            stmt.executeUpdate(sql);
            System.out.println("Employee table created successfully");

            // Close the statement and connection
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
}
