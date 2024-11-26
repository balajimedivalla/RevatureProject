package packagemytests; // Correct package declaration

import com.revshop.servlet.RegistrationServlet; // Correct import statement
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class RegistrationServletTest {
    private RegistrationServlet registrationServlet; // Declaration of servlet class
    private HttpServletRequest request; // Declaration of HttpServletRequest
    private HttpServletResponse response; // Declaration of HttpServletResponse

    @BeforeEach
    public void setUp() {
        registrationServlet = new RegistrationServlet(); // Initialize the servlet
        request = mock(HttpServletRequest.class); // Mocking the request
        response = mock(HttpServletResponse.class); // Mocking the response
    }

    @Test
    public void testSuccessfulRegistration() throws ServletException, IOException {
        // Set up mock parameters for a successful registration
        when(request.getParameter("FirstName")).thenReturn("John");
        when(request.getParameter("LastName")).thenReturn("Doe");
        when(request.getParameter("Email")).thenReturn("john.doe@example.com");
        when(request.getParameter("Password")).thenReturn("password");
        when(request.getParameter("UserRole")).thenReturn("buyer");
        when(request.getParameter("Gender")).thenReturn("Male");
        when(request.getParameter("MobileNumber")).thenReturn("1234567890");

        // Call the doPost method
        registrationServlet.doPost(request, response);

        // Verify that the response was redirected to the success page
        verify(response).sendRedirect("Sucess.jsp");
    }

    // Additional test cases can be added here
}

