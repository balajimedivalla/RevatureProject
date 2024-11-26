package Serveletss;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewTable")
public class ViewTableServlet extends HttpServlet {
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
            rs = stmt.executeQuery("SELECT * FROM " + tableName);

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            response.setContentType("text/html");
            StringBuilder htmlContent = new StringBuilder();

            htmlContent.append("<h2>Data from Table: ").append(tableName).append("</h2>");
            htmlContent.append("<table border='1' style='width: 80%; margin: 20px auto;'>");
            
            // Table headers
            htmlContent.append("<tr>");
            for (int i = 1; i <= columnCount; i++) {
                htmlContent.append("<th>").append(metaData.getColumnName(i)).append("</th>");
            }
            htmlContent.append("</tr>");
            
            // Table rows
            while (rs.next()) {
                htmlContent.append("<tr>");
                for (int i = 1; i <= columnCount; i++) {
                    htmlContent.append("<td>").append(rs.getString(i)).append("</td>");
                }
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
