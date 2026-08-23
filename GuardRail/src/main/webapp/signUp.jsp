<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>GuardRail - Console Signup</title>
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
            color: #2d3748;
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
            color: #2d3748;
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
            color: #2d3748;
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
            border-color: #2d3748;
        }
        .submit-btn {
            background-color: #2d3748;
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
            background-color: #1a202c;
        }
    </style>
</head>
<body>

    <header>
        <div class="brand">
            <span>GuardRail</span>
        </div>
        <div class="nav-links">
            <a href="index.jsp">Home</a>
            <a href="login.jsp" style="font-weight: bold;">Sign In</a>
        </div>
    </header>

    <div class="form-container">
        <h2>Register Compliance Node</h2>

        <form action="register" method="post">

            <div class="form-group">
                <label>Security Operator Username</label>
                <input type="text" name="username" required>
            </div>

            <div class="form-group">
                <label>Corporate Contact Email</label>
                <input type="text" name="email" required>
            </div>

            <div class="form-group">
                <label>Compliance Policy Level</label>
                <select name="complianceLevel" required>
                    <option value="Standard SOC2">Standard Compliance (SOC2)</option>
                    <option value="Strict HIPAA">High Compliance (HIPAA / PCI)</option>
                </select>
            </div>

            <div class="form-group">
                <label>Network Allowed Server Node Code</label>
                <input type="text" name="nodeCode" required>
            </div>

            <div class="form-group">
                <label>Console Secret Key Password</label>
                <input type="password" name="password" required>
            </div>

            <div class="form-group">
                <label>Confirm Secret Key</label>
                <input type="password" name="confirmPassword" required>
            </div>

            <input type="submit" value="PROVISION SCANNER" class="submit-btn">

        </form>
    </div>

</body>
</html>
