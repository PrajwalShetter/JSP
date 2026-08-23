<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>VideoSphere - Watch & Share</title>
    <style>
        /* Basic clean layout */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
            color: #333;
        }

        /* Top Navigation Bar */
        header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #ffffff;
            padding: 10px 20px;
            border-bottom: 1px solid #e0e0e0;
        }
        .logo-section img {
            height: 30px;
            vertical-align: middle;
        }
        .logo-section span {
            font-size: 20px;
            font-weight: bold;
            margin-left: 8px;
            letter-spacing: -0.5px;
        }
        .search-bar input {
            width: 400px;
            padding: 8px 12px;
            border: 1px solid #ccc;
            border-radius: 4px 0 0 4px;
            outline: none;
        }
        .search-bar button {
            padding: 8px 15px;
            border: 1px solid #ccc;
            border-left: none;
            background-color: #f8f8f8;
            border-radius: 0 4px 4px 0;
            cursor: pointer;
        }
        .search-bar button:hover {
            background-color: #f0f0f0;
        }

        /* Video Feed Grid */
        .container {
            padding: 30px 20px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .section-title {
            font-size: 18px;
            margin-bottom: 20px;
        }
        .video-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
            gap: 20px;
        }

        /* Individual Video Cards */
        .video-card {
            background-color: #ffffff;
            border-radius: 8px;
            overflow: hidden;
            text-decoration: none;
            color: inherit;
        }
        .thumbnail-box img {
            width: 100%;
            display: block;
            background-color: #000;
        }
        .video-info {
            padding: 12px;
        }
        .video-title {
            font-size: 14px;
            font-weight: bold;
            margin: 0 0 6px 0;
            line-height: 1.4;
        }
        .video-meta {
            font-size: 12px;
            color: #606060;
            margin: 0;
        }
    </style>
</head>
<body>

    <!-- Header Navigation -->
    <header>
        <div class="logo-section">
            <img src="${pageContext.request.contextPath}/images/logo.png" alt="Logo">
            <span>VideoSphere</span>
        </div>

        <div class="search-bar">
            <form action="search.jsp" method="GET">
                <input type="text" name="query" placeholder="Search videos...">
                <button type="submit">Search</button>
            </form>
        </div>

        <div class="user-menu">
            <a href="upload.jsp" style="text-decoration: none; color: #065fd4; font-weight: bold;">Upload</a>
                        <a href="signUp.jsp" style="text-decoration: none; color: #065fd4; font-weight: bold;">SignUp</a>
        </div>
    </header>

    <!-- Main Content Area -->
    <div class="container">
        <h2 class="section-title">Recommended Videos</h2>

        <div class="video-grid">

            <!-- Video Item 1 -->
            <a href="watch.jsp?id=1" class="video-card">
                <div class="thumbnail-box">
                    <img src="${pageContext.request.contextPath}/images/thumbnail.png" alt="Video Thumbnail">
                </div>
                <div class="video-info">
                    <p class="video-title">Building a Java Web App from Scratch Using Tomcat</p>
                    <p class="video-meta">CodeAcademy • 15K views • 2 days ago</p>
                </div>
            </a>

            <!-- Video Item 2 -->
            <a href="watch.jsp?id=2" class="video-card">
                <div class="thumbnail-box">
                    <img src="${pageContext.request.contextPath}/images/thumbnail.png" alt="Video Thumbnail">
                </div>
                <div class="video-info">
                    <p class="video-title">Understanding web.xml Configuration File</p>
                    <p class="video-meta">DevChannel • 42K views • 1 week ago</p>
                </div>
            </a>

            <!-- Video Item 3 -->
            <a href="watch.jsp?id=3" class="video-card">
                <div class="thumbnail-box">
                    <img src="${pageContext.request.contextPath}/images/thumbnail.png" alt="Video Thumbnail">
                </div>
                <div class="video-info">
                    <p class="video-title">How to Fix 404 Errors on Tomcat Server</p>
                    <p class="video-meta">ServerTips • 8K views • 5 hours ago</p>
                </div>
            </a>

        </div>
    </div>

</body>
</html>
