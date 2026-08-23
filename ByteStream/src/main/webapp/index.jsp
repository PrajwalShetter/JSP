<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ByteStream - High-Speed Data Pipelines</title>
    <style>
        /* Base Reset & Styling */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        body {
            background-color: #0f172a; /* Deep tech dark background */
            color: #f8fafc;
            overflow-x: hidden;
        }

        /* Navigation Bar */
        header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 8%;
            background-color: rgba(15, 23, 42, 0.8);
            backdrop-filter: blur(10px);
            position: fixed;
            width: 100%;
            top: 0;
            z-index: 100;
        }
        .logo {
            font-size: 24px;
            font-weight: 700;
            color: #38bdf8; /* Light blue accent */
            letter-spacing: 1px;
        }
        nav ul {
            display: flex;
            list-style: none;
        }
        nav ul li {
            margin-left: 30px;
        }
        nav ul li a {
            color: #94a3b8;
            text-decoration: none;
            font-weight: 500;
            transition: color 0.3s;
        }
        nav ul li a:hover {
            color: #38bdf8;
        }

        /* Hero Section */
        .hero {
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            text-align: center;
            padding: 120px 20px 60px 20px;
        }
        .hero h1 {
            font-size: 3.5rem;
            font-weight: 800;
            margin-bottom: 20px;
            max-width: 800px;
            line-height: 1.2;
            background: linear-gradient(to right, #ffffff, #38bdf8);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
        }
        .hero p {
            font-size: 1.2rem;
            color: #94a3b8;
            max-width: 600px;
            margin-bottom: 40px;
            line-height: 1.6;
        }

        /* Call To Action Buttons */
        .cta-btn {
            background: linear-gradient(135deg, #38bdf8, #2563eb);
            color: white;
            padding: 14px 32px;
            border-radius: 8px;
            text-decoration: none;
            font-weight: 600;
            font-size: 1rem;
            box-shadow: 0 4px 20px rgba(56, 189, 248, 0.3);
            transition: transform 0.2s, box-shadow 0.2s;
        }
        .cta-btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 6px 25px rgba(56, 189, 248, 0.4);
        }

        /* Dynamic Image/Dashboard Placeholder */
        .dashboard-preview {
            margin-top: 60px;
            width: 80%;
            max-width: 1000px;
            border-radius: 12px;
            border: 1px solid #334155;
            box-shadow: 0 20px 40px rgba(0,0,0,0.5);
            background-color: #1e293b;
            padding: 10px;
        }
        .dashboard-preview img {
            width: 100%;
            border-radius: 8px;
            display: block;
        }
    </style>
</head>
<body>

    <!-- Header Navigation -->
    <header>
        <div class="logo">ByteStream_</div>
        <nav>
            <ul>
                <li><a href="#features">Features</a></li>
                <li><a href="getUser.jsp">User Profile</a></li>
                <li><a href="signUp.jsp">SignUp</a></li>
            </ul>
        </nav>
    </header>

    <!-- Main Hero Landing Area -->
    <section class="hero">
        <h1>Streamless Media & Data Delivery at Scale</h1>
        <p>A lightning-fast, secure file management and live streaming infrastructure engineered for modern web architectures.</p>

        <a href="#get-started" class="cta-btn">Deploy Free Instance</a>

        <!-- Dynamic Context Path Image -->
        <div class="dashboard-preview">
            <img src="${pageContext.request.contextPath}/images/hero-dashboard.png" alt="ByteStream Dashboard Analytics Interface">
        </div>
    </section>

</body>
</html>
