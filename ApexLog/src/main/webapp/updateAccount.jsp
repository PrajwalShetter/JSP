<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ps" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ApexLog - Developer Signup</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #ffffff;
            color: #111111;
        }
        header {
            background-color: #ffffff;
            padding: 20px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 1px solid #dddddd;
        }
        .brand span {
            font-size: 20px;
            font-weight: bold;
            color: #1a365d;
        }
        .nav-links a {
            color: #555555;
            text-decoration: none;
            margin-left: 20px;
            font-size: 14px;
        }
        .nav-links a:hover {
            color: #000000;
            text-decoration: underline;
        }
        .form-container {
            max-width: 500px;
            margin: 40px auto;
            padding: 30px;
            border: 1px solid #dddddd;
            border-radius: 6px;
        }
        .form-container h2 {
            font-size: 22px;
            font-weight: bold;
            margin: 0 0 20px 0;
            color: #1a365d;
            border-bottom: 1px solid #dddddd;
            padding-bottom: 10px;
        }
        .form-group {
            margin-bottom: 16px;
        }
        .form-group label {
            display: block;
            font-size: 13px;
            font-weight: bold;
            margin-bottom: 6px;
            color: #444444;
        }
        .form-group input[type="text"],
        .form-group input[type="password"],
        .form-group select {
            width: 100%;
            padding: 10px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            box-sizing: border-box;
            outline: none;
        }
        .radio-group {
            display: flex;
            gap: 15px;
            padding-top: 5px;
        }
        .radio-group label {
            display: inline-flex;
            align-items: center;
            font-weight: normal;
            font-size: 14px;
            cursor: pointer;
        }
        .radio-group input {
            margin-right: 6px;
        }
        .submit-btn {
            background-color: #1a365d;
            color: #ffffff;
            border: none;
            width: 100%;
            padding: 12px;
            border-radius: 4px;
            font-size: 15px;
            font-weight: bold;
            cursor: pointer;
            margin-top: 10px;
        }
        .submit-btn:hover {
            background-color: #0f2442;
        }
    </style>
</head>
<body>

    <header>
        <div class="brand">
            <span>ApexLog_</span>
        </div>
        <div class="nav-links">
            <a href="index.jsp">Home</a>
            <a href="login.jsp" style="font-weight: bold;">Sign In</a>
        </div>
    </header>

    <div class="form-container">
        <h2>Developer Account Registration</h2>

        <form action="updateAccount" method="post">

            <input name="id" value="${dto.getId()}" hidden>
            <div class="form-group">
                <label>User Name</label>
                <input type="text" name="userName" value="${dto.getUserName()}" required>
            </div>

            <div class="form-group">
                <label>Email Address</label>
                <input type="text" name="email" value="${dto.getEmail()}" required>
            </div>

            <div class="form-group">
                <label>Gender</label>
                <div class="radio-group">
                    <label><input type="radio" name="gender" value="Male" checked> Male</label>
                    <label><input type="radio" name="gender" value="Female"> Female</label>
                    <label><input type="radio" name="gender" value="Other"> Other</label>
                </div>
            </div>

            <div class="form-group">
                <label>Account Type</label>
                <select name="accountType" required>
                    <option value="Developer">Developer (Free Node)</option>
                    <option value="Enterprise">Enterprise (Cluster Node)</option>
                </select>
            </div>
            <input type="submit" value="Update" class="submit-btn">

        </form>
    </div>

</body>
</html>
