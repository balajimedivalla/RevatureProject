package Serveletss;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteRow")
public class DeleteRowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String databaseName = request.getParameter("database");
        String tableName = request.getParameter("table");
        String id = request.getParameter("id");  // Getting the id from the form

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // Load database driver and establish connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, "root", "root");

            // SQL query to delete the row with the specified id
            String sql = "DELETE FROM " + tableName + " WHERE id = ?";
            
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);  // Setting the id to the query

            // Execute the delete operation
            int rowsAffected = pstmt.executeUpdate();

            response.setContentType("text/html");
            response.getWriter().write("<html><body>");
            
            if (rowsAffected > 0) {
                response.getWriter().write("<p>Row with ID " + id + " has been successfully deleted from table " + tableName + ".</p>");
            } else {
                response.getWriter().write("<p>Error: Row with ID " + id + " not found in table " + tableName + ".</p>");
            }

            // Add "Back to Tables" link
            response.getWriter().write("<br><br><a href='tables?database=" + databaseName + "'>Back to Tables</a>");
            response.getWriter().write("</body></html>");

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("<html><body><p>Error: " + e.getMessage() + "</p></body></html>");
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
