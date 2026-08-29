<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>YieldMap - Agricultural Logistics</title>
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
            color: #2b5c8f;
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
        .container {
            max-width: 800px;
            margin: 60px auto;
            padding: 0 20px;
            text-align: center;
        }
        .container h1 {
            font-size: 34px;
            font-weight: bold;
            line-height: 1.2;
            margin: 0 0 20px 0;
            color: #2b5c8f;
        }
        .container p {
            font-size: 16px;
            line-height: 1.6;
            color: #444444;
            margin: 0 0 35px 0;
        }
        .action-box {
            margin-bottom: 50px;
        }
        .action-box a {
            background-color: #2b5c8f;
            color: #ffffff;
            text-decoration: none;
            padding: 13px 32px;
            border-radius: 4px;
            font-size: 15px;
            font-weight: bold;
            display: inline-block;
        }
        .action-box a:hover {
            background-color: #1e436b;
        }
    </style>
</head>
<body>

    <header>
        <div class="brand">
            <span>YieldMap</span>
        </div>
        <div class="nav-links">
            <a href="signUp.jsp" style="font-weight: bold;">Register Hub</a>
            <a href="getUser.jsp">User profile</a>
        </div>
    </header>

    <div class="container">
        <h1>Track agricultural yields and cold-storage operations.</h1>
        <p>YieldMap monitors incoming crop harvest batches, records warehouse storage metrics, and structures comprehensive temperature compliance profiles across supply chains.</p>
        <div class="action-box">
            <a href="signup.jsp">Register Storage Unit</a>
        </div>
    </div>

</body>
</html>
