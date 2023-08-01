<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
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
         input[type="username"],
        input[type="password"]
        {
            width: 90%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 10px;
        }
        
        input[type="signin"] {
            width: 80%;
            padding: 10px;
            background-color: #007bff;
            color: #ffffff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        
        input[type="signin"]:hover {
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
        
        a {
            text-align: center;
            display: block;
        }
        
    </style>
</head>
<body>
  <div class="container">
    <h1>Sign In</h1>
    <form action="signin" method="POST">
      <div class="form-group">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
      </div>
      <br>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
      </div>
      <br>
      <div class="form-group">
        <input type="submit" value="Sign In">
      </div>
    </form>
   <div class="error-message">
        ${error}
    </div>
    <div class="links-container"> <!-- Container to center the links -->
        <a href="/signup">Sign Up</a>
        <a href="/forgotpassword">Forgot Password</a>
    </div>
  </div>
</body>
</html>