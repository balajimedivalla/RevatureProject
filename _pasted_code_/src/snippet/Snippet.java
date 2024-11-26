package snippet;

public class Snippet {
	<%@ page import="java.sql.*, java.util.*" %>
	<%
	    String productId = request.getParameter("productId");
	    String buyerId = (String) session.getAttribute("buyerId"); // Ensure the buyer is logged in
	
	    if (productId != null && buyerId != null) {
	        String DB_URL = "jdbc:mysql://localhost:3306/revshop";
	        String DB_USER = "root";
	        String DB_PASSWORD = "root";
	
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	
	            // Get product price
	            String priceQuery = "SELECT price FROM products WHERE id = ?";
	            PreparedStatement priceStatement = connection.prepareStatement(priceQuery);
	            priceStatement.setInt(1, Integer.parseInt(productId));
	            ResultSet priceResultSet = priceStatement.executeQuery();
	
	            if (priceResultSet.next()) {
	                double price = priceResultSet.getDouble("price");
	                double totalPrice = price; // Assuming quantity is 1 for now
	
	                // Insert into cart
	                String insertQuery = "INSERT INTO cart (product_id, buyer_id, quantity, total_price) VALUES (?, ?, ?, ?)";
	                PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
	                insertStatement.setInt(1, Integer.parseInt(productId));
	                insertStatement.setInt(2, Integer.parseInt(buyerId));
	                insertStatement.setInt(3, 1); // Default quantity
	                insertStatement.setDouble(4, totalPrice);
	                insertStatement.executeUpdate();
	            }
	
	            priceResultSet.close();
	            priceStatement.close();
	            connection.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	    response.sendRedirect("products.jsp"); // Redirect back to the products page
	%>
	
}

