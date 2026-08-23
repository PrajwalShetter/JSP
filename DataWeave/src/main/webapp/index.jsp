<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>DataWeave - JSON Parsing Engine</title>
    <style>
        /* Plain Layout Construction */
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

        /* Centralized Stacked Content Container */
        .stacked-layout {
            max-width: 800px;
            margin: 60px auto;
            padding: 0 20px;
            text-align: center;
        }
        .stacked-layout h1 {
            font-size: 34px;
            font-weight: bold;
            line-height: 1.2;
            margin: 0 0 20px 0;
        }
        .stacked-layout p {
            font-size: 16px;
            line-height: 1.6;
            color: #444444;
            margin: 0 0 35px 0;
        }

        /* Centered Inline Form Block */
        .weave-form {
            margin-bottom: 50px;
        }
        .weave-form input[type="text"] {
            width: 320px;
            padding: 12px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            margin-right: 8px;
        }
        .weave-form button {
            background-color: #111111;
            color: #ffffff;
            border: none;
            padding: 13px 24px;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
        }
        .weave-form button:hover {
            background-color: #333333;
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
            <img src="${pageContext.request.contextPath}/images/weave-logo.png" alt="DataWeave Logo">
            <span>DataWeave</span>
        </div>
        <div class="nav-links">
            <a href="parser.jsp">Data Parser</a>
            <a href="getUser.jsp">Uer Profile</a>
            <a href="signUp.jsp" style="font-weight: bold; color: #000000;">Console Login</a>
        </div>
    </header>

    <!-- Main Stacked Content Grid -->
    <div class="stacked-layout">

        <h1>Parse and transform unstructured data feeds.</h1>

        <p>DataWeave acts as a backend data integration pipeline. It processes text files, filters complex API response objects, and maps keys into uniform database schemas. Input your stream file path to parse records immediately.</p>

        <!-- Form Stacked centered -->
        <div class="weave-form">
            <form action="parser.jsp" method="GET">
                <input type="text" name="streamSource" placeholder="Enter target dataset source path" required>
                <button type="submit">Parse Stream</button>
            </form>
        </div>

        <!-- Wide System Mockup Preview at Bottom -->
        <div class="preview-box">
            <img src="${pageContext.request.contextPath}/images/data-preview.png" alt="DataWeave Core Execution Log Output Screen">
        </div>

    </div>

</body>
</html>
