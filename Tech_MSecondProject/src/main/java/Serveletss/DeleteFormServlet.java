package Serveletss;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteForm")
public class DeleteFormServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String databaseName = request.getParameter("database");
        String tableName = request.getParameter("table");

        response.setContentType("text/html");
        response.getWriter().write("<html><body>");
        response.getWriter().write("<h2>Enter ID to delete row from table " + tableName + "</h2>");
        response.getWriter().write("<form action='deleteRow' method='get'>");
        response.getWriter().write("<input type='hidden' name='database' value='" + databaseName + "'>");
        response.getWriter().write("<input type='hidden' name='table' value='" + tableName + "'>");
        response.getWriter().write("Enter ID to delete: <input type='text' name='id' required>");
        response.getWriter().write("<input type='submit' value='Delete'>");
        response.getWriter().write("</form>");
        response.getWriter().write("</body></html>");
    }
}
