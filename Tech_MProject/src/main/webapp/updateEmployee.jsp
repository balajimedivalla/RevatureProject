<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Employee</title>
</head>
<body>
    <h1>Update Employee</h1>
    <form action="updateEmployee" method="post">
        <label for="id">Employee ID:</label>
        <input type="number" id="id" name="id" required><br><br>
        
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="mobile">Mobile:</label>
        <input type="tel" id="mobile" name="mobile" required><br><br>
        
        <button type="submit">Update Employee</button>
    </form>
</body>
</html>
