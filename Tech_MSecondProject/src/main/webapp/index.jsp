<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Database List</title>
    <style>
        table {
            width: 60%;
            border-collapse: collapse;
            margin: 25px auto;
            font-size: 18px;
            text-align: left;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 8px 12px;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        a {
            color: #007bff;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2 style="text-align: center;">Available Databases:</h2>

    <%
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");

            
            stmt = con.createStatement();
            rs = stmt.executeQuery("SHOW DATABASES");
          
            out.println("<table>");
            out.println("<tr><th>Database Name</th><th>Action</th></tr>");

          
            while (rs.next()) {
                String databaseName = rs.getString(1);
                out.println("<tr>");
                out.println("<td>" + databaseName + "</td>");
               
                out.println("<td><a href='tables?database=" + databaseName + "'>Show Tables</a></td>");
                out.println("</tr>");
            }
         
            out.println("</table>");

        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    %>

</body>
</html>
