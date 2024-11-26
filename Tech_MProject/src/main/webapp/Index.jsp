<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Table CRUD Operations</title>
    <style>
        /* CSS to center the content */
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f4f4f4;
        }
        .container {
            text-align: center;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        ul li {
            margin: 10px 0;
        }
        ul li a {
            text-decoration: none;
            color: #007bff;
            font-size: 18px;
        }
        ul li a:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Employee Table CRUD Operations</h1>
        <ul>
            <li><a href="addEmployee.jsp">Add Employee</a></li>
            <li><a href="ListEmployees.jsp">View Employees</a></li>
            <li><a href="updateEmployee.jsp">Update Employee</a></li>
            <li><a href="deleteEmployee.jsp">Delete Employee</a></li>
        </ul>
    </div>
</body>
</html>
