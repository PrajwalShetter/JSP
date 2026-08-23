<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FleetWire - Logistics Signup</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #ffffff;
            color: #111111;
        }
        header {
            background-color: #ffffff;
            padding: 20px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 1px solid #dddddd;
        }
        .brand span {
            font-size: 20px;
            font-weight: bold;
            color: #2b5c8f;
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
        .form-container {
            max-width: 450px;
            margin: 50px auto;
            padding: 30px;
            border: 1px solid #e2e8f0;
            border-radius: 6px;
        }
        .form-container h2 {
            font-size: 22px;
            font-weight: bold;
            margin: 0 0 20px 0;
            color: #2b5c8f;
            border-bottom: 1px solid #e2e8f0;
            padding-bottom: 10px;
        }
        .form-group {
            margin-bottom: 16px;
        }
        .form-group label {
            display: block;
            font-size: 13px;
            font-weight: bold;
            margin-bottom: 6px;
            color: #2b5c8f;
        }
        .form-group input, .form-group select {
            width: 100%;
            padding: 10px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            box-sizing: border-box;
            outline: none;
            background-color: #ffffff;
        }
        .form-group input:focus, .form-group select:focus {
            border-color: #2b5c8f;
        }
        .submit-btn {
            background-color: #2b5c8f;
            color: #ffffff;
            border: none;
            width: 100%;
            padding: 12px;
            border-radius: 4px;
            font-size: 15px;
            font-weight: bold;
            cursor: pointer;
            margin-top: 10px;
        }
        .submit-btn:hover {
            background-color: #1e436b;
        }
    </style>
</head>
<body>

    <header>
        <div class="brand">
            <span>FleetWire</span>
        </div>
        <div class="nav-links">
            <a href="index.jsp">Home</a>
            <a href="login.jsp" style="font-weight: bold;">Sign In</a>
        </div>
    </header>

    <div class="form-container">
        <h2>Register Logistics Profile</h2>

        <form action="register" method="post">

            <div class="form-group">
                <label>Driver License Number</label>
                <input type="text" name="licenseNumber" required>
            </div>

            <div class="form-group">
                <label>Operator Full Name</label>
                <input type="text" name="operatorName" required>
            </div>

            <div class="form-group">
                <label>Assigned Vehicle Capacity (Tons)</label>
                <input type="text" name="vehicleCapacity" placeholder="e.g., 5.5" required>
            </div>

            <div class="form-group">
                <label>Regional Zone Code</label>
                <input type="text" name="zoneCode" required>
            </div>

            <div class="form-group">
                <label>Portal Password</label>
                <input type="password" name="password" required>
            </div>

            <div class="form-group">
                <label>Confirm Password</label>
                <input type="password" name="confirmPassword" required>
            </div>

            <input type="submit" value="REGISTER ASSET" class="submit-btn">

        </form>
    </div>

</body>
</html>
