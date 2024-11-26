package Serveletss;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tables")
public class TablesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String databaseName = request.getParameter("database");
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, "root", "root");

            stmt = con.createStatement();
            rs = stmt.executeQuery("SHOW TABLES");

            response.setContentType("text/html");
            StringBuilder htmlContent = new StringBuilder();

            htmlContent.append("<h2>Tables in Database: " + databaseName + "</h2>");
            htmlContent.append("<table border='1' style='width: 60%; margin: 20px auto;'>");
            htmlContent.append("<tr><th>Table Name</th><th>Actions</th></tr>");

            while (rs.next()) {
                String tableName = rs.getString(1);
                htmlContent.append("<tr>");
                htmlContent.append("<td>" + tableName + "</td>");
                htmlContent.append("<td>");
                htmlContent.append("<a href='viewTable?database=" + databaseName + "&table=" + tableName + "'>View</a> | ");
                htmlContent.append("<a href='insertRow?database=" + databaseName + "&table=" + tableName + "'>Insert</a> | ");
                htmlContent.append("<a href='updateForm?database=" + databaseName + "&table=" + tableName + "'>Update</a> | ");
                // Link to the delete page, where user will input the id
                htmlContent.append("<a href='deleteForm?database=" + databaseName + "&table=" + tableName + "'>Delete</a>");
                htmlContent.append("</td>");
                htmlContent.append("</tr>");
            }

            htmlContent.append("</table>");
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
}
