<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>RevShop - Welcome</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url('https://t3.ftcdn.net/jpg/03/13/53/94/360_F_313539495_TIfAx53PwhMQopiuu7J1RiY2lVzSWrep.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            margin: 0;
            height: 100vh;
            display: flex;
            flex-direction: column;
        }

        /* Navigation bar styles */
        nav {
            background-color: rgba(0, 0, 0, 0.7);
            width: 100%;
            padding: 10px 0;
            position: sticky;
            top: 0;
        }

        nav ul {
            list-style-type: none;
            padding: 0;
            margin: 0;
            display: flex;
            justify-content: center;
        }

        nav ul li {
            margin: 0 15px;
        }

        nav ul li a {
            color: white;
            text-decoration: none;
            font-size: 18px;
            padding: 10px;
            transition: background-color 0.3s;
        }

        nav ul li a:hover {
            background-color: #444;
        }

        /* Center content styles */
        .welcome {
            flex: 1;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            color: white;
            text-align: center;
        }

        .welcome h1 {
            font-size: 48px;
            margin-bottom: 20px;
        }

        .welcome p {
            font-size: 24px;
        }
    </style>
</head>
<body>

    <!-- Navigation bar -->
    <nav>
        <ul>
            <li><a href="home.jsp">Home</a></li>
            <li><a href="register.jsp">Register</a></li>
            <li><a href="contact.jsp">Contact Us</a></li>
            <li><a href="login.jsp">Sign In</a></li>
        </ul>
    </nav>

    <!-- Welcome content in the center -->
    <div class="welcome">
        <h1>Welcome to RevShop</h1>
        <p>Your one-stop solution for all your shopping needs!</p>
    </div>

</body>
</html>
