package Servelets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        String id = request.getParameter("id");

        String url = "jdbc:mysql://localhost:3306/userdb"; 
        String user = "root"; 
        String password = "root"; 

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            conn = DriverManager.getConnection(url, user, password);
            
           
            pstmt = conn.prepareStatement("DELETE FROM Employee WHERE Id = ?");
            pstmt.setInt(1, Integer.parseInt(id)); 

          
            int rowsAffected = pstmt.executeUpdate();

            
            response.sendRedirect("Sucess.jsp");
        } catch (Exception e) {
            e.printStackTrace();
  
        }
    }
}
