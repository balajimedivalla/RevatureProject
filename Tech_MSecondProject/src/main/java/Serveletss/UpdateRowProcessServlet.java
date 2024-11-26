package Serveletss;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateRow")
public class UpdateRowProcessServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String databaseName = request.getParameter("database");
        String tableName = request.getParameter("table");
        String id = request.getParameter("id");

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, "root", "root");

            // Build the UPDATE SQL dynamically based on form inputs
            StringBuilder sql = new StringBuilder("UPDATE " + tableName + " SET ");
            StringBuilder columns = new StringBuilder();

            for (String columnName : request.getParameterMap().keySet()) {
                if (!columnName.equals("database") && !columnName.equals("table") && !columnName.equals("id")) {
                    columns.append(columnName + " = ?, ");
                }
            }

            // Remove trailing comma and space
            if (columns.length() > 0) {
                columns.setLength(columns.length() - 2);
            }

            sql.append(columns);
            sql.append(" WHERE id = ?");

            pstmt = con.prepareStatement(sql.toString());

            // Set values for the columns
            int index = 1;
            for (String columnName : request.getParameterMap().keySet()) {
                if (!columnName.equals("database") && !columnName.equals("table") && !columnName.equals("id")) {
                    pstmt.setString(index++, request.getParameter(columnName));
                }
            }

            // Set the ID value for WHERE clause
            pstmt.setString(index, id);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                // Redirect to a success page after successful update
                response.sendRedirect("success.jsp?message=Row+updated+successfully");
            } else {
                // Redirect to an error page or show an error message
                response.sendRedirect("error.jsp?message=Error+updating+row");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp?message=" + e.getMessage());
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
