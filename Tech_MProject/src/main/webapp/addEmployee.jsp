<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding Employees</title>
</head>
<body>
<h1> Add The Employee Details</h1>

<form action="addEmployee" method="post">
    <label for="Name">Name</label>
    <input type="text" id="name" name="name" required><br>

    <label for="Email">Email</label>
    <input type="email" id="email" name="email" required><br>

    <label for="Mobile">Mobile</label>
    <input type="tel" id="number" name="number" required><br>

    <button type="submit">Submit</button>
</form>

</body>
</html>
