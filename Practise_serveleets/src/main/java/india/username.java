package india;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/userform")
public class username extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  name=request.getParameter("username");
		
		String age=request.getParameter("age");
		
		try
		{
			int a=Integer.parseInt(age);
            
            System.out.println("Name : "+name);
            System.out.println("Age : "+a);
		}
		catch (NumberFormatException e) {
	        
	        System.err.println("Invalid age input: " + age);
	    }
		
	}
}
