<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Employee</title>
</head>
<body>
    <h2>Delete Employee</h2>
    <form action="DeleteEmployee" method="post">
        <label for="employeeId">Employee ID</label>
        <input type="text" id="employeeId" name="id" required />
        <input type="submit" value="Delete Employee" />
    </form>
    <br>
    <a href="Index.jsp">Back to Home</a>
</body>
</html>
