<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Forgot Password</title>
    <!-- Add any CSS or JavaScript files here -->
</head>
<body>
    <h1>Forgot Password</h1>
    <form action="/reset-password-sent" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br>
        <input type="submit" value="Reset Password">
    </form>
</body>
</html>