<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FinTrack - Budget Registration</title>
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
            color: #2f855a;
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
            color: #2f855a;
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
            color: #2f855a;
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
            border-color: #2f855a;
        }
        .submit-btn {
            background-color: #2f855a;
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
            background-color: #226442;
        }
    </style>
</head>
<body>

    <header>
        <div class="brand">
            <span>FinTrack</span>
        </div>
        <div class="nav-links">
            <a href="index.jsp">Home</a>
            <a href="login.jsp" style="font-weight: bold;">Sign In</a>
        </div>
    </header>

    <div class="form-container">
        <h2>Create Budget Account</h2>

        <form action="register" method="post">

            <div class="form-group">
                <label>Account Username</label>
                <input type="text" name="username" required>
            </div>

            <div class="form-group">
                <label>Estimated Monthly Income</label>
                <input type="text" name="monthlyIncome" placeholder="e.g., 50000" required>
            </div>

            <div class="form-group">
                <label>Primary Currency</label>
                <select name="currency" required>
                    <option value="INR">INR (₹)</option>
                    <option value="USD">USD ($)</option>
                    <option value="EUR">EUR (€)</option>
                </select>
            </div>

            <div class="form-group">
                <label>Monthly Savings Goal</label>
                <input type="text" name="savingsGoal" placeholder="e.g., 15000" required>
            </div>

            <div class="form-group">
                <label>Account Password</label>
                <input type="password" name="password" required>
            </div>

            <div class="form-group">
                <label>Confirm Password</label>
                <input type="password" name="confirmPassword" required>
            </div>

            <input type="submit" value="INITIALIZE LEDGER" class="submit-btn">

        </form>
    </div>

</body>
</html>
