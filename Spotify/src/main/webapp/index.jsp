<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SoundWave - Web Player</title>
    <style>
        /* Clean Layout Structural Code */
        body {
            font-family: Arial, Helvetica, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #121212;
            color: #ffffff;
        }

        /* Top Bar Interface */
        header {
            background-color: #070707;
            padding: 15px 30px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .brand {
            display: flex;
            align-items: center;
        }
        .brand img {
            width: 35px;
            height: 35px;
            margin-right: 10px;
        }
        .brand span {
            font-size: 22px;
            font-weight: bold;
            letter-spacing: -0.5px;
        }
        .nav-links a {
            color: #b3b3b3;
            text-decoration: none;
            margin-left: 25px;
            font-size: 14px;
            font-weight: bold;
        }
        .nav-links a:hover {
            color: #ffffff;
        }

        /* Content Container grid Layout */
        .main-content {
            padding: 30px;
            max-width: 1300px;
            margin: 0 auto;
        }
        .shelf-title {
            font-size: 22px;
            font-weight: bold;
            margin-bottom: 16px;
        }
        .music-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(180px, 1fr));
            gap: 24px;
            margin-bottom: 40px;
        }

        /* Card Container Design */
        .music-card {
            background-color: #181818;
            padding: 16px;
            border-radius: 6px;
            text-decoration: none;
            color: inherit;
            display: block;
        }
        .music-card:hover {
            background-color: #282828;
        }
        .cover-box img {
            width: 100%;
            aspect-ratio: 1/1;
            object-fit: cover;
            border-radius: 4px;
            box-shadow: 0 8px 24px rgba(0,0,0,0.5);
            margin-bottom: 16px;
        }
        .card-heading {
            font-size: 14px;
            font-weight: bold;
            margin: 0 0 8px 0;
            white-space: nowrap;
            overflow: hidden;
            text-overflow: ellipsis;
        }
        .card-subtext {
            font-size: 12px;
            color: #b3b3b3;
            margin: 0;
            line-height: 1.4;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header Bar -->
    <header>
        <div class="brand">
            <img src="${pageContext.request.contextPath}/images/app-logo.jpg" alt="SoundWave App Logo">
            <span>SoundWave</span>
        </div>
        <div class="nav-links">
            <a href="discover.jsp">Discover</a>
            <a href="getUser.jsp">User profile</a>
            <a href="signUp.jsp" style="background-color: #ffffff; color: #000000; padding: 10px 24px; border-radius: 20px;">SignUp</a>
        </div>
    </header>

    <!-- Main Content Stream Area -->
    <div class="main-content">

        <!-- Music Section -->
        <h2 class="shelf-title">Popular Albums</h2>
        <div class="music-grid">

            <!-- Card 1 -->
            <a href="album.jsp?id=101" class="music-card">
                <div class="cover-box">
                    <img src="${pageContext.request.contextPath}/images/album-cover.png" alt="Midnight Drive Album Cover Artwork">
                </div>
                <h3 class="card-heading">Midnight Drive</h3>
                <p class="card-subtext">By Neon Horizon • 2025</p>
            </a>

            <!-- Card 2 -->
            <a href="album.jsp?id=102" class="music-card">
                <div class="cover-box">
                    <img src="${pageContext.request.contextPath}/images/album-cover.png" alt="Acoustic Sessions Album Cover Artwork">
                </div>
                <h3 class="card-heading">Acoustic Sessions</h3>
                <p class="card-subtext">By Clara & The Strings</p>
            </a>

            <!-- Card 3 -->
            <a href="album.jsp?id=103" class="music-card">
                <div class="cover-box">
                    <img src="${pageContext.request.contextPath}/images/album-cover.png" alt="Urban Beats Vol 4 Album Cover Artwork">
                </div>
                <h3 class="card-heading">Urban Beats Vol. 4</h3>
                <p class="card-subtext">Various Artists • Compilation</p>
            </a>

        </div>

        <!-- Podcasts Section -->
        <h2 class="shelf-title">Trending Podcasts</h2>
        <div class="music-grid">

            <!-- Card 4 -->
            <a href="podcast.jsp?id=201" class="music-card">
                <div class="cover-box">
                    <img src="${pageContext.request.contextPath}/images/pod-cover.png" alt="The Tech Daily Podcast Cover Artwork">
                </div>
                <h3 class="card-heading">The Tech Daily</h3>
                <p class="card-subtext">Daily tech news updates</p>
            </a>

            <!-- Card 5 -->
            <a href="podcast.jsp?id=202" class="music-card">
                <div class="cover-box">
                    <img src="${pageContext.request.contextPath}/images/pod-cover.png" alt="Code & Coffee Podcast Cover Artwork">
                </div>
                <h3 class="card-heading">Code &amp; Coffee</h3>
                <p class="card-subtext">Developer stories weekly</p>
            </a>

        </div>

    </div>

</body>
</html>
