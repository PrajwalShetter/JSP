<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>EduPulse - Student Academic Dashboard</title>
    <style>
        /* Base Page Configurations with Soft Tint Background */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4fbf7; /* Gentle soft mint background tint */
            color: #2d3748;
        }

        /* Top Header Navbar */
        header {
            background-color: #ffffff;
            padding: 20px 40px;
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
            width: 28px;
            height: 28px;
            margin-right: 10px;
        }
        .brand span {
            font-size: 20px;
            font-weight: bold;
            color: #1e4620; /* Academic Forest Green */
        }
        .nav-links a {
            color: #4a5568;
            text-decoration: none;
            margin-left: 20px;
            font-size: 14px;
        }
        .nav-links a:hover {
            color: #1e4620;
            text-decoration: underline;
        }

        /* Main Two-Column Layout Grid */
        .dashboard-layout {
            max-width: 1150px;
            margin: 50px auto;
            padding: 0 30px;
            display: flex;
            gap: 40px;
            align-items: flex-start;
        }

        /* Left Hand Text Info Column */
        .info-column {
            flex: 1.2;
            padding-top: 20px;
        }
        .info-column h1 {
            font-size: 34px;
            font-weight: bold;
            line-height: 1.2;
            color: #1a202c;
            margin: 0 0 15px 0;
        }
        .info-column p {
            font-size: 16px;
            line-height: 1.6;
            color: #4a5568;
            margin: 0 0 30px 0;
        }

        /* Form Controls */
        .portal-form input[type="text"] {
            width: 250px;
            padding: 12px;
            border: 1px solid #cbd5e0;
            border-radius: 4px;
            font-size: 14px;
            margin-right: 8px;
            outline: none;
            background-color: #ffffff;
        }
        .portal-form button {
            background-color: #1e4620;
            color: #ffffff;
            border: none;
            padding: 13px 24px;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
        }
        .portal-form button:hover {
            background-color: #143216;
        }

        /* Right Hand Content Card Column */
        .preview-column {
            flex: 0.8;
            background-color: #ffffff;
            border: 1px solid #e2e8f0;
            border-radius: 8px;
            padding: 25px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.02);
        }
        .preview-column h3 {
            font-size: 16px;
            margin: 0 0 15px 0;
            color: #1e4620;
            border-bottom: 1px solid #edf2f7;
            padding-bottom: 8px;
        }

        /* Simulated Data Summary Lists */
        .metric-row {
            display: flex;
            justify-content: space-between;
            padding: 10px 0;
            font-size: 14px;
            border-bottom: 1px dashed #edf2f7;
        }
        .metric-row:last-child {
            border-bottom: none;
        }
        .metric-label {
            color: #718096;
        }
        .metric-value {
            font-weight: bold;
            color: #2d3748;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header -->
    <header>
        <div class="brand">
            <img src="images/edu-logo.jpg" alt="EduPulse Academic Logo">
            <span>EduPulse</span>
        </div>
        <div class="nav-links">
            <a href="attendance.jsp">Attendance Log</a>
            <a href="getUser.jsp">User Profile</a>
            <a href="signUp.jsp" style="font-weight: bold; color: #1e4620;">signUp</a>
        </div>
    </header>

    <!-- Main Dynamic Two Column Layout -->
    <div class="dashboard-layout">

        <!-- Left Structural Column - Marketing Text & Form -->
        <div class="info-column">
            <h1>Track student milestones and attendance pulses.</h1>
            <p>EduPulse acts as a central communication system linking university administration, teachers, and student rosters. Input a unique student roll card registration number below to check real-time campus metrics.</p>

            <div class="portal-form">
                <form action="student_dashboard.jsp" method="GET">
                    <input type="text" name="rollNumber" placeholder="Enter Roll Number (e.g., CS-2026-04)" required>
                    <button type="submit">Access Profile</button>
                </form>
            </div>
        </div>

        <!-- Right Structural Column - Mock Panel Preview Container -->
        <div class="preview-column">
            <h3>Quick Dashboard Summary</h3>

            <div class="metric-row">
                <span class="metric-label">Current Academic Semester</span>
                <span class="metric-value">Semester IV</span>
            </div>
            <div class="metric-row">
                <span class="metric-label">Overall Attendance Pulse</span>
                <span class="metric-value" style="color: #2f855a;">88.5% (Safe)</span>
            </div>
            <div class="metric-row">
                <span class="metric-label">Pending Lab Assignments</span>
                <span class="metric-value" style="color: #c53030;">02 Reminders</span>
            </div>
            <div class="metric-row">
                <span class="metric-label">Next Scheduled Evaluation</span>
                <span class="metric-value">18-Aug-2026</span>
            </div>
        </div>

    </div>

</body>
</html>
