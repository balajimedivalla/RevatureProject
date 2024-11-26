<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Seller Dashboard</title>
    <link rel="stylesheet" href="style.css"> <!-- Link the CSS file -->
</head>
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

    /* Form Styles */
    form {
        width: 60%;
        margin: 40px auto;
        background-color: white;
        padding: 25px;
        border-radius: 8px;
        box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.1);
    }

    form label {
        display: block;
        margin-top: 12px;
        font-weight: bold;
        font-size: 16px;
        color: #333;
    }

    form input[type="text"],
    form textarea,
    form input[type="file"] {
        width: 100%;
        padding: 12px;
        margin: 12px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 14px;
    }

    form button {
        background-color: #00b4d8;
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 4px;
        font-size: 16px;
        cursor: pointer;
        transition: all 0.3s ease;
    }

    form button:hover {
        background-color: #0077b6;
        box-shadow: 0 3px 8px rgba(0, 0, 0, 0.2);
    }

    /* Table Styles */
    table {
        width: 85%;
        margin: 40px auto;
        border-collapse: collapse;
        background-color: white;
        border-radius: 8px;
        box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.1);
    }

    table th, table td {
        padding: 15px;
        text-align: left;
        border-bottom: 1px solid #ddd;
        font-size: 16px;
    }

    table th {
        background-color: #023e8a;
        color: white;
        text-transform: uppercase;
        font-size: 18px;
    }

    table tr:hover {
        background-color: #e3f2fd;
    }

    /* Button styles in table */
    .action-buttons a {
        padding: 10px 15px;
        text-decoration: none;
        color: white;
        background-color: #0077b6;
        border-radius: 4px;
        transition: all 0.3s ease;
    }

    .action-buttons a:hover {
        background-color: #023e8a;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }

    .action-buttons a.delete {
        background-color: #f44336;
    }

    .action-buttons a.delete:hover {
        background-color: #d32f2f;
    }

</style>
<body>
    <h1>Welcome to Seller Dashboard</h1>
    <nav>
        <ul>
            <li><a href="manageInventory.jsp">Manage Inventory</a></li>
            <li><a href="addProduct.jsp">Add New Products</a></li>
            <li><a href="viewOrders.jsp">View Orders</a></li>
            <li><a href="viewReviews.jsp">View Reviews</a></li>
        </ul>
    </nav>
</body>
</html>




































