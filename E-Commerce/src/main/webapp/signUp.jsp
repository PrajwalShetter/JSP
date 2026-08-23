<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>AuraMarket - Create E-Commerce Account</title>
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
            padding: 15px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 1px solid #e9ecef;
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
            color: #1a365d; /* Vibrant Navy Blue brand accent */
        }
        .nav-links a {
            color: #495057;
            text-decoration: none;
            margin-left: 20px;
            font-size: 14px;
        }
        .nav-links a:hover {
            color: #1a365d;
            text-decoration: underline;
        }

        /* Centered Form Wrapper Block */
        .form-container {
            max-width: 480px;
            margin: 50px auto;
            padding: 30px;
            border: 1px solid #dee2e6;
            border-radius: 6px;
        }
        .form-container h2 {
            font-size: 22px;
            font-weight: bold;
            margin: 0 0 20px 0;
            color: #1a365d;
            border-bottom: 1px solid #dee2e6;
            padding-bottom: 10px;
        }

        /* Stacked Input Row Styling */
        .form-group {
            margin-bottom: 16px;
        }
        .form-group label {
            display: block;
            font-size: 13px;
            font-weight: bold;
            margin-bottom: 6px;
            color: #495057;
        }
        .form-group input[type="text"],
        .form-group input[type="email"],
        .form-group input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            box-sizing: border-box;
            outline: none;
        }
        .form-group input:focus {
            border-color: #1a365d;
        }

        /* Form Submission Action Button */
        .submit-btn {
            background-color: #1a365d;
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
            background-color: #0f2442;
        }

        .login-redirect {
            text-align: center;
            margin-top: 15px;
            font-size: 13px;
            color: #6c757d;
        }
        .login-redirect a {
            color: #1a365d;
            text-decoration: none;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header -->
    <header>
        <div class="brand">
            <img src="${pageContext.request.contextPath}/images/shop-logo.png" alt="AuraMarket Logo">
            <span>AuraMarket</span>
        </div>
        <div class="nav-links">
            <a href="catalog.jsp">Browse Items</a>
            <a href="login.jsp" style="font-weight: bold;">Sign In</a>
        </div>
    </header>

    <!-- Main Form Element wrapper -->
    <div class="form-container">
        <h2>Create Buyer Account</h2>

        <form action="registerBuyer" method="POST">

            <div class="form-group">
                <label>User ID / Username</label>
                <input type="text" name="buyerId" required>
            </div>

            <div class="form-group">
                <label>Email Address</label>
                <input type="email" name="email" required>
            </div>

            <div class="form-group">
                <label>Contact Mobile Number</label>
                <input type="text" name="mobile" placeholder="e.g., +91 9876543210" required>
            </div>

            <div class="form-group">
                <label>Default Shipping Address</label>
                <input type="text" name="address" placeholder="Street name, Building, City" required>
            </div>

            <div class="form-group">
                <label>Password</label>
                <input type="password" name="password" required>
            </div>

            <div class="form-group">
                <label>Confirm Password</label>
                <input type="password" name="confirmPassword" required>
            </div>

            <input type="submit" value="REGISTER ACCOUNT" class="submit-btn">

            <div class="login-redirect">
                Already have an account? <a href="login.jsp">Sign In here</a>
            </div>

        </form>
    </div>

</body>
</html>
