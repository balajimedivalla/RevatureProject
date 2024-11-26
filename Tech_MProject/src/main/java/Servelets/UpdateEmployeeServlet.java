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


@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {
    private static final String URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String UPDATE_EMPLOYEE_SQL = "UPDATE Employee SET Name = ?, Email = ?, Mobile = ? WHERE Id = ?";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Retrieve form data
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        long mobile = Long.parseLong(request.getParameter("mobile"));
        
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_SQL)) {
            
           
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setLong(3, mobile);
            preparedStatement.setInt(4, id);
         
            preparedStatement.executeUpdate();
            
            response.sendRedirect("Sucess.jsp");
        } catch (Exception e) {
           
            e.printStackTrace();
            
        }
    }
}
