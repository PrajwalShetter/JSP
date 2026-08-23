<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>QuickDoc - Book Medical Appointments</title>
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
            color: #086788; /* Professional Teal Accent */
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

        /* Main Hero Presentation Area */
        .hero-section {
            max-width: 1000px;
            margin: 50px auto 30px auto;
            padding: 0 20px;
            text-align: center;
        }
        .hero-section h1 {
            font-size: 32px;
            font-weight: bold;
            margin: 0 0 12px 0;
        }
        .hero-section p {
            font-size: 15px;
            color: #555555;
            margin: 0 0 35px 0;
        }

        /* Horizontal Multi-Input Filter Bar */
        .search-container {
            background-color: #f8f9fa;
            border: 1px solid #dddddd;
            border-radius: 6px;
            padding: 15px;
            display: inline-flex;
            gap: 10px;
            margin-bottom: 50px;
        }
        .search-container select, .search-container input[type="text"] {
            padding: 10px;
            border: 1px solid #cccccc;
            border-radius: 4px;
            font-size: 14px;
            background-color: #ffffff;
            outline: none;
        }
        .search-container button {
            background-color: #086788;
            color: #ffffff;
            border: none;
            padding: 10px 24px;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
        }
        .search-container button:hover {
            background-color: #064e68;
        }

        /* Distinct 3-Column Content Row */
        .services-row {
            max-width: 1100px;
            margin: 0 auto 60px auto;
            padding: 0 20px;
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 30px;
        }
        .service-box {
            border: 1px solid #e0e0e0;
            border-radius: 6px;
            padding: 25px;
            text-align: left;
            background-color: #ffffff;
        }
        .service-box h3 {
            font-size: 16px;
            font-weight: bold;
            margin: 0 0 10px 0;
            color: #086788;
        }
        .service-box p {
            font-size: 13px;
            line-height: 1.5;
            color: #666666;
            margin: 0;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header -->
    <header>
        <div class="brand">
            <img src="images/doc-log.jpg" alt="QuickDoc Logo">
            <span>QuickDoc</span>
        </div>
        <div class="nav-links">
            <a href="appointments.jsp">My Appointments</a>
            <a href="getUser.jsp">user profile</a>
            <a href="signUp.jsp" style="font-weight: bold; color: #086788;">signUp</a>
        </div>
    </header>

    <!-- Main Hero Presentation -->
    <div class="hero-section">
        <h1>Find and book local medical consultants instantly.</h1>
        <p>Skip the waiting room. Select your required medical specialty, pick a convenient calendar slot, and secure a confirmed digital check-in token.</p>

        <!-- Horizontal Filter Bar Form -->
        <form action="search_results.jsp" method="GET" class="search-container">
            <select name="specialty" required>
                <option value="">Select Medical Specialty</option>
                <option value="general">General Medicine</option>
                <option value="pediatrics">Pediatrics</option>
                <option value="cardiology">Cardiology</option>
                <option value="dermatology">Dermatology</option>
            </select>

            <input type="text" name="location" placeholder="Enter City or Postal Code" required>

            <button type="submit">Search Doctors</button>
        </form>
    </div>

    <!-- Distinct Three Column Utility Row -->
    <div class="services-row">

        <div class="service-box">
            <h3>Verified Practitioners</h3>
            <p>Every registered medical consultant undergoes a credential evaluation process before appearing in search directories.</p>
        </div>

        <div class="service-box">
            <h3>Digital Check-In Tokens</h3>
            <p>Receive a live tracking token instantly upon confirmation to cut down physical waiting room delays at the clinic.</p>
        </div>

        <div class="service-box">
            <h3>Secure Health Vault</h3>
            <p>Access your past visit histories, electronic prescriptions, and laboratory summaries securely from any web browser.</p>
        </div>

    </div>

</body>
</html>
