<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ApexLog - Unified Log Streaming</title>
    <style>
        /* Clean Layout Structural Code */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #ffffff;
            color: #111111;
        }

        /* Top Header Navbar */
        header {
            background-color: #ffffff;
            padding: 20px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 1px solid #dddddd;
        }
        .brand {
            display: flex;
            align-items: center;
        }
        .brand img {
            width: 26px;
            height: 26px;
            margin-right: 10px;
        }
        .brand span {
            font-size: 20px;
            font-weight: bold;
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

        /* Centralized Stacked Container */
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
        }
        .container p {
            font-size: 16px;
            line-height: 1.6;
            color: #444444;
            margin: 0 0 35px 0;
        }

        /* Input Form Block */
        .log-form {
            margin-bottom: 50px;
        }
        .log-form input[type="text"] {
            width: 320px;
            padding: 12px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            margin-right: 8px;
            outline: none;
        }
        .log-form button {
            background-color: #1a365d; /* Clean Deep Navy Accent */
            color: #ffffff;
            border: none;
            padding: 13px 24px;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
        }
        .log-form button:hover {
            background-color: #0f2442;
        }

        /* Wide Lower Image Area */
        .preview-box {
            width: 100%;
            border: 1px solid #cccccc;
            border-radius: 4px;
            padding: 6px;
            background-color: #ffffff;
        }
        .preview-box img {
            width: 100%;
            height: auto;
            display: block;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header -->
    <header>
        <div class="brand">
            <img src="images/apex-logo.png" alt="ApexLog Logo">
            <span>ApexLog</span>
        </div>
        <div class="nav-links">
            <a href="getAllUser">View All Users</a>
            <a href="getUser.jsp">User Profile</a>
            <a href="signUp.jsp" style="font-weight: bold; color: #000000;">signUp</a>
        </div>
    </header>

    <!-- Main Stacked Content Grid -->
    <div class="container">

        <h1>Centralize your application logs in real time.</h1>

        <p>ApexLog monitors exceptions, HTTP status codes, and server requests across multiple Tomcat nodes. Input a target application context path or server directory path below to begin streaming operational metrics.</p>

        <!-- Form Stacked Centered -->
        <div class="log-form">
            <form action="streams.jsp" method="GET">
                <input type="text" name="appPath" placeholder="Enter context path (e.g., /practice_programs)" required>
                <button type="submit">Stream Logs</button>
            </form>
        </div>

        <!-- Wide System Mockup Preview at Bottom -->
        <div class="preview-box">
            <img src="images/stream-preview.jpg" alt="ApexLog Stream Console Interface Screen">
        </div>

    </div>

</body>
</html>
