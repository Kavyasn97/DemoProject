<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Forgot Password</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        
        h1 {
            text-align: center;
            margin: 20px 0;
        }
        
        form {
            max-width: 400px;
            margin: 20px auto;
            padding: 20px;
            background-color: #ffffff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        
        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }
        
        input[type="text"],
        input[type="email"]
        input[type="newpassword"],
        input[type="confirm newpassword"] {
            width: 90%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 10px;
        }
        
        input[type="reset"] {
            width: 80%;
            padding: 10px;
            background-color: #007bff;
            color: #ffffff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        
        input[type="reset"]:hover {
            background-color: #0056b3;
        }
        
        .error-message {
            color: red;
            margin-top: 10px;
            text-align: center;
        }
        
        a {
            color: #007bff;
            text-decoration: none;
            display: inline-block;
            margin-right: 10px; /* Add some space between the hyperlinks */
        }

        a:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Reset Password</h1>
    <form action="${pageContext.request.contextPath}/forgotpassword" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br>
        <label for="newPassword">New Password:</label>
        <input type="password" id="newPassword" name="newPassword" required>
        <br>
        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required>
        <br>
        <input type="submit" value="Reset Password">
    </form>
    <div class="links-container"> <!-- Container to center the links -->
        <a href="/signin">Sign In</a>
    </div>
    ${error} 
</body>
</html>