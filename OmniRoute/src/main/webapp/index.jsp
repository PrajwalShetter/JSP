<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>OmniRoute - Smart Logistics</title>
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
            width: 28px;
            height: 28px;
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

        /* Two Column Main Split */
        .main-layout {
            max-width: 1100px;
            margin: 50px auto;
            padding: 0 40px;
            display: flex;
            align-items: center;
            gap: 50px;
        }
        .content-column {
            flex: 1;
        }
        .content-column h1 {
            font-size: 32px;
            font-weight: bold;
            line-height: 1.3;
            margin: 0 0 15px 0;
        }
        .content-column p {
            font-size: 15px;
            line-height: 1.5;
            color: #444444;
            margin: 0 0 25px 0;
        }

        /* Input Form Block */
        .route-form input[type="text"] {
            width: 240px;
            padding: 10px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            margin-right: 8px;
        }
        .route-form button {
            background-color: #111111;
            color: #ffffff;
            border: none;
            padding: 11px 20px;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
        }
        .route-form button:hover {
            background-color: #333333;
        }

        /* Image Display Box */
        .image-column {
            flex: 1;
            text-align: center;
        }
        .image-column img {
            width: 100%;
            max-width: 450px;
            border: 1px solid #cccccc;
            border-radius: 4px;
            display: block;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header -->
    <header>
        <div class="brand">
            <img src="${pageContext.request.contextPath}/images/route-logo.png" alt="OmniRoute Logo">
            <span>OmniRoute</span>
        </div>
        <div class="nav-links">
            <a href="tracking.jsp">Track Shipment</a>
            <a href="getUser.jsp">User Profile</a>
            <a href="signUp.jsp" style="font-weight: bold; color: #000000;">SignUp</a>
        </div>
    </header>

    <!-- Main Content Grid -->
    <div class="main-layout">

        <!-- Left Side Text & Tracker -->
        <div class="content-column">
            <h1>Optimize and track your delivery routes.</h1>
            <p>OmniRoute handles fleet sequencing, delivery dispatching, and accurate destination routing. Enter your tracking manifest number below to monitor an active fleet vehicle.</p>

            <div class="route-form">
                <form action="tracking.jsp" method="GET">
                    <input type="text" name="trackingID" placeholder="Enter Tracking ID Number" required>
                    <button type="submit">Track Route</button>
                </form>
            </div>
        </div>

        <!-- Right Side Simple Interface Preview -->
        <div class="image-column">
            <img src="${pageContext.request.contextPath}/images/map-preview.png" alt="OmniRoute System Map Tracking Screen Interface">
        </div>

    </div>

</body>
</html>
