package Serveletss;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertRow")
public class InsertRowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String databaseName = request.getParameter("database");
        String tableName = request.getParameter("table");

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, "root", "root");

            stmt = con.createStatement();
            rs = stmt.executeQuery("DESCRIBE " + tableName);

            response.setContentType("text/html");
            StringBuilder htmlContent = new StringBuilder();

            htmlContent.append("<h2>Insert Data into Table: ").append(tableName).append("</h2>");
            htmlContent.append("<form method='post' action='insertRow'>");
            htmlContent.append("<input type='hidden' name='database' value='").append(databaseName).append("'>");
            htmlContent.append("<input type='hidden' name='table' value='").append(tableName).append("'>");

            while (rs.next()) {
                String columnName = rs.getString("Field");
                String isAutoIncrement = rs.getString("Extra");

                // Skip auto-increment fields
                if (isAutoIncrement != null && isAutoIncrement.equalsIgnoreCase("auto_increment")) {
                    continue;
                }

                htmlContent.append("<label for='").append(columnName).append("'>").append(columnName).append(": </label>");
                htmlContent.append("<input type='text' name='").append(columnName).append("' required><br><br>");
            }

            htmlContent.append("<button type='submit'>Insert</button>");
            htmlContent.append("</form>");

            response.getWriter().write(htmlContent.toString());
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("<p>Error: " + e.getMessage() + "</p>");
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String databaseName = request.getParameter("database");
        String tableName = request.getParameter("table");

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, "root", "root");

            StringBuilder columns = new StringBuilder();
            StringBuilder placeholders = new StringBuilder();

            // Build the query dynamically
            for (String key : request.getParameterMap().keySet()) {
                if (!key.equals("database") && !key.equals("table")) {
                    if (columns.length() > 0) {
                        columns.append(", ");
                        placeholders.append(", ");
                    }
                    columns.append(key);
                    placeholders.append("?");
                }
            }

            String sql = "INSERT INTO " + tableName + " (" + columns + ") VALUES (" + placeholders + ")";
            pstmt = con.prepareStatement(sql);

            int index = 1;
            for (String key : request.getParameterMap().keySet()) {
                if (!key.equals("database") && !key.equals("table")) {
                    pstmt.setString(index++, request.getParameter(key));
                }
            }

            int rowsInserted = pstmt.executeUpdate();
            response.setContentType("text/html");
            response.getWriter().write("<p>Data inserted successfully into table: " + tableName + ". Rows affected: " + rowsInserted + "</p>");
            response.getWriter().write("<a href='tables?database=" + databaseName + "'>Back to Tables</a>");
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
