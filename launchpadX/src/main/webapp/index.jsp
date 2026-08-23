<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>LaunchPadX - Instant Deployment Cloud</title>
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
        .launch-form {
            margin-bottom: 50px;
        }
        .launch-form input[type="text"] {
            width: 320px;
            padding: 12px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            margin-right: 8px;
            outline: none;
        }
        .launch-form button {
            background-color: #1e4620; /* Clean Forest Green Accent */
            color: #ffffff;
            border: none;
            padding: 13px 24px;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
        }
        .launch-form button:hover {
            background-color: #143216;
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
            <img src="${pageContext.request.contextPath}/images/launch-logo.png" alt="LaunchPadX Logo">
            <span>LaunchPadX</span>
        </div>
        <div class="nav-links">
            <a href="clusters.jsp">Active Clusters</a>
            <a href="getUser.jsp">User Profile</a>
            <a href="signUp.jsp" style="font-weight: bold; color: #000000;">signUp</a>
        </div>
    </header>

    <!-- Main Stacked Content Grid -->
    <div class="container">

        <h1>Automate your build pipelines instantly.</h1>

        <p>LaunchPadX detects repository updates, runs integrated test scripts, and compiles war files directly into local or remote Tomcat servers. Paste your Git repository URL below to spin up a live build container.</p>

        <!-- Form Stacked Centered -->
        <div class="launch-form">
            <form action="deploy.jsp" method="POST">
                <input type="text" name="repoUrl" placeholder="Enter your Git repository URL (e.g., ://github.com...)" required>
                <button type="submit">Launch Branch</button>
            </form>
        </div>

        <!-- Wide System Mockup Preview at Bottom -->
        <div class="preview-box">
            <img src="${pageContext.request.contextPath}/images/terminal-preview.png" alt="LaunchPadX Build Pipeline Terminal Log Screen">
        </div>

    </div>

</body>
</html>
