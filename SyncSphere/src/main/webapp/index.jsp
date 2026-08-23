<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SyncSphere - Team Collaboration Hub</title>
    <style>
        /* Clean Layout Structural Code */
        body {
            font-family: "Segoe UI", Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #fcfcfd;
            color: #2d3748;
        }

        /* Top Bar Interface */
        header {
            background-color: #ffffff;
            padding: 15px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 1px solid #e2e8f0;
        }
        .brand {
            display: flex;
            align-items: center;
        }
        .brand img {
            width: 32px;
            height: 32px;
            margin-right: 12px;
        }
        .brand span {
            font-size: 20px;
            font-weight: 700;
            color: #2b6cb0;
            letter-spacing: -0.5px;
        }
        .nav-links a {
            color: #4a5568;
            text-decoration: none;
            margin-left: 25px;
            font-size: 15px;
            font-weight: 500;
        }
        .nav-links a:hover {
            color: #2b6cb0;
        }

        /* Two-Column Hero Split Container */
        .hero-container {
            max-width: 1200px;
            margin: 60px auto;
            padding: 0 40px;
            display: flex;
            align-items: center;
            gap: 40px;
        }
        .hero-text {
            flex: 1;
        }
        .hero-text h1 {
            font-size: 38px;
            font-weight: 800;
            line-height: 1.2;
            color: #1a202c;
            margin-bottom: 20px;
        }
        .hero-text p {
            font-size: 16px;
            line-height: 1.6;
            color: #718096;
            margin-bottom: 30px;
        }

        /* Forms and Action Items */
        .sync-form input[type="email"] {
            width: 260px;
            padding: 12px;
            border: 1px solid #cbd5e0;
            border-radius: 6px;
            font-size: 14px;
            outline: none;
            margin-right: 10px;
        }
        .sync-form button {
            background-color: #2b6cb0;
            color: #ffffff;
            border: none;
            padding: 12px 24px;
            border-radius: 6px;
            font-size: 14px;
            font-weight: 600;
            cursor: pointer;
        }
        .sync-form button:hover {
            background-color: #2c5282;
        }

        /* Right Side Image Placement */
        .hero-image {
            flex: 1;
            text-align: center;
        }
        .hero-image img {
            width: 100%;
            max-width: 500px;
            border-radius: 8px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.05);
            border: 1px solid #e2e8f0;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header Bar -->
    <header>
        <div class="brand">
            <img src="${pageContext.request.contextPath}/images/sync-logo.png" alt="SyncSphere Logo">
            <span>SyncSphere</span>
        </div>
        <div class="nav-links">
            <a href="features.jsp">Features</a>
            <a href="getUser.jsp">User Profile</a>
            <a href="signUp.jsp" style="border: 1px solid #2b6cb0; color: #2b6cb0; padding: 8px 18px; border-radius: 4px;">SignIn</a>
        </div>
    </header>

    <!-- Main Hero Section Split Layout -->
    <div class="hero-container">

        <!-- Left Side Information column -->
        <div class="hero-text">
            <h1>Keep your team work synchronized in one clean sphere.</h1>
            <p>SyncSphere connects your project files, local databases, and document updates across your entire workspace in real-time. Stop dealing with manual merge conflicts.</p>

            <div class="sync-form">
                <form action="register.jsp" method="POST">
                    <input type="email" name="userEmail" placeholder="Enter your work email" required>
                    <button type="submit">Create Workspace</button>
                </form>
            </div>
        </div>

        <!-- Right Side Mockup Graphic -->
        <div class="hero-image">
            <img src="${pageContext.request.contextPath}/images/dashboard-mock.png" alt="SyncSphere Workspace Desktop Interface Preview">
        </div>

    </div>

</body>
</html>
