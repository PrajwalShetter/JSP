<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FleetWire - Corporate Vehicle Logistics</title>
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
            color: #2b5c8f; /* Industrial Steel Blue */
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

        /* Centered Context Row Container */
        .hero-banner {
            max-width: 800px;
            margin: 60px auto 40px auto;
            padding: 0 20px;
            text-align: center;
        }
        .hero-banner h1 {
            font-size: 34px;
            font-weight: bold;
            line-height: 1.2;
            margin: 0 0 20px 0;
        }
        .hero-banner p {
            font-size: 16px;
            line-height: 1.6;
            color: #444444;
            margin: 0 0 35px 0;
        }

        /* Centralized Input Form */
        .fleet-form {
            margin-bottom: 50px;
        }
        .fleet-form input[type="text"] {
            width: 320px;
            padding: 12px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            margin-right: 8px;
            outline: none;
        }
        .fleet-form button {
            background-color: #2b5c8f;
            color: #ffffff;
            border: none;
            padding: 13px 24px;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
        }
        .fleet-form button:hover {
            background-color: #1e436b;
        }

        /* Balanced 3-Column Metrics Layout Row */
        .metrics-grid {
            max-width: 1000px;
            margin: 0 auto 60px auto;
            padding: 0 20px;
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 25px;
        }
        .metric-box {
            border: 1px solid #e0e0e0;
            border-radius: 6px;
            padding: 20px;
            text-align: left;
            background-color: #fcfcfc;
        }
        .metric-title {
            font-size: 13px;
            font-weight: bold;
            color: #666666;
            text-transform: uppercase;
            letter-spacing: 0.5px;
            margin: 0 0 8px 0;
        }
        .metric-number {
            font-size: 24px;
            font-weight: bold;
            color: #111111;
            margin: 0 0 5px 0;
        }
        .metric-desc {
            font-size: 12px;
            color: #888888;
            margin: 0;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header -->
    <header>
        <div class="brand">
            <img src="images/fleet-logo.jpeg" alt="FleetWire Logo">
            <span>FleetWire</span>
        </div>
        <div class="nav-links">
            <a href="vehicles.jsp">Manage Fleet</a>
            <a href="getUser.jsp">User profile</a>
            <a href="signUp.jsp" style="font-weight: bold; color: #2b5c8f;">signUp</a>
        </div>
    </header>

    <!-- Main Stacked Marketing View -->
    <div class="hero-banner">
        <h1>Track fleet deployment and operational costs.</h1>
        <p>FleetWire connects corporate vehicle booking workflows, dispatch logging systems, and fuel allocation receipts into a single ledger. Input a registered license plate number below to track an active vehicle asset.</p>

        <!-- Central Search Bar Form -->
        <div class="fleet-form">
            <form action="vehicle_status.jsp" method="GET">
                <input type="text" name="plateNumber" placeholder="Enter Vehicle License Plate (e.g., KA-02-MJ-5678)" required>
                <button type="submit">Track Asset</button>
            </form>
        </div>
    </div>

    <!-- Multi-Column Operational Metrics Section -->
    <div class="metrics-grid">

        <div class="metric-box">
            <p class="metric-title">Active Vehicles</p>
            <p class="metric-number">42 / 50</p>
            <p class="metric-desc">Transit units currently out on regional routes</p>
        </div>

        <div class="metric-box">
            <p class="metric-title">Pending Maintenance</p>
            <p class="metric-number">03 Units</p>
            <p class="metric-desc">Scheduled for inspection within 48 hours</p>
        </div>

        <div class="metric-box">
            <p class="metric-title">Monthly Fuel Efficiency</p>
            <p class="metric-number">14.2 km/L</p>
            <p class="metric-desc">Average network efficiency score across fleets</p>
        </div>

    </div>

</body>
</html>
