<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seller Dashboard</title>
    <style>
        /* General Styles */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(120deg, #84fab0 0%, #8fd3f4 100%);
            margin: 0;
            padding: 0;
            color: #444;
        }

        /* Navigation Bar */
        nav {
            background: #0077b6;
            padding: 15px 0;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }

        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
        }

        nav ul li {
            margin: 0 15px;
        }

        nav ul li a {
            color: white;
            padding: 10px 25px;
            font-size: 18px;
            font-weight: bold;
            text-transform: uppercase;
            text-decoration: none;
            transition: all 0.3s ease;
            background-color: #023e8a;
            border-radius: 30px;
        }

        nav ul li a:hover {
            background-color: #00b4d8;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        }

        /* Main Header */
        h1 {
            text-align: center;
            color: white;
            font-size: 36px;
            padding: 30px 0;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);
            background: #03045e;
            margin: 0;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
        }
    </style>
</head>
<body>
    <h1>Welcome to Seller Dashboard</h1>
    <nav>
        <ul>
            <li><a href="/manageInventory">Manage Inventory</a></li>
            <li><a href="/addProduct">Add New Products</a></li>
            <li><a href="/viewOrders">View Orders</a></li>
            <li><a href="/viewReviews">View Reviews</a></li>
        </ul>
    </nav>
</body>
</html>
