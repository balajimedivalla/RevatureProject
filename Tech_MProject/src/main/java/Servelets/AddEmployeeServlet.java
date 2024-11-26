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

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String name = request.getParameter("name");  
        String email = request.getParameter("email"); 
        String mobile = request.getParameter("number"); 

        try {
          
            final String username = "root";
            final String password = "root";
            final String url = "jdbc:mysql://localhost:3306/userdb?useSSL=false";

            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(url, username, password);

            
            String sql = "INSERT INTO Employee(Name, Email, Mobile) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, mobile); 

            
            pstmt.executeUpdate();

            response.sendRedirect("Sucess.jsp");

         
            pstmt.close();
            con.close();

        } catch (Exception e) {
   
            e.printStackTrace();
        }
    }
}
