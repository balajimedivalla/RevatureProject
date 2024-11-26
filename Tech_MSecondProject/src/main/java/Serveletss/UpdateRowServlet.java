package Serveletss;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateForm")
public class UpdateRowServlet extends HttpServlet {

    // Handle GET request to show the update form
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String databaseName = request.getParameter("database");
        String tableName = request.getParameter("table");

        response.setContentType("text/html");
        response.getWriter().write("<h2>Update Row in Table: " + tableName + "</h2>");

        // Provide a form to input the primary key (ID) of the row to update
        response.getWriter().write("<form action='updateForm' method='post'>");
        response.getWriter().write("<input type='hidden' name='database' value='" + databaseName + "'/>");
        response.getWriter().write("<input type='hidden' name='table' value='" + tableName + "'/>");
        response.getWriter().write("<label>Enter Row ID to Update:</label>");
        response.getWriter().write("<input type='text' name='id' required/><br/><br>");
        response.getWriter().write("<input type='submit' value='Fetch Row for Update'/>");
        response.getWriter().write("</form>");
    }

    // Handle POST request to fetch the row data and display the update form
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String databaseName = request.getParameter("database");
        String tableName = request.getParameter("table");
        String id = request.getParameter("id");

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, "root", "root");

            // Query to fetch the row data based on ID
            String sql = "SELECT * FROM " + tableName + " WHERE id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            response.setContentType("text/html");
            StringBuilder htmlContent = new StringBuilder();

            if (rs.next()) {
                htmlContent.append("<h2>Update Row in Table: " + tableName + "</h2>");
                htmlContent.append("<form action='updateRow' method='post'>");
                htmlContent.append("<input type='hidden' name='database' value='" + databaseName + "'/>");
                htmlContent.append("<input type='hidden' name='table' value='" + tableName + "'/>");
                htmlContent.append("<input type='hidden' name='id' value='" + id + "'/>");

                // Dynamically create form inputs for each column in the table
                ResultSetMetaData rsMetaData = rs.getMetaData();
                int columnCount = rsMetaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = rsMetaData.getColumnName(i);
                    String columnValue = rs.getString(i);
                    htmlContent.append("<label>" + columnName + ":</label>");
                    htmlContent.append("<input type='text' name='" + columnName + "' value='" + columnValue + "'/><br/><br>");
                }

                htmlContent.append("<input type='submit' value='Update'/>");
                htmlContent.append("</form>");
            } else {
                htmlContent.append("<p>No record found with the provided ID.</p>");
            }

            response.getWriter().write(htmlContent.toString());
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("<p>Error: " + e.getMessage() + "</p>");
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Handle the final update in the database after form submission
   
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
                    response.getWriter().write("<p>Row updated successfully!</p>");
                } else {
                    response.getWriter().write("<p>Error: Row not updated.</p>");
                }
            } catch (Exception e) {
                e.printStackTrace();
                response.getWriter().write("<p>Error: " + e.getMessage() + "</p>");
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
}
