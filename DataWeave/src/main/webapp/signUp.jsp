<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>DataWeave - Pipeline Registration</title>
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
            color: #111111;
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
            border: 1px solid #dddddd;
            border-radius: 4px;
        }
        .form-container h2 {
            font-size: 22px;
            font-weight: bold;
            margin: 0 0 20px 0;
            border-bottom: 1px solid #dddddd;
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
            color: #444444;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            box-sizing: border-box;
            outline: none;
        }
        .form-group input:focus {
            border-color: #111111;
        }
        .submit-btn {
            background-color: #111111;
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
            background-color: #333333;
        }
    </style>
</head>
<body>

    <header>
        <div class="brand">
            <span>DataWeave</span>
        </div>
        <div class="nav-links">
            <a href="index.jsp">Home</a>
            <a href="login.jsp" style="font-weight: bold;">Sign In</a>
        </div>
    </header>

    <div class="form-container">
        <h2>Register Data Stream</h2>

        <form action="register" method="post">



            <div class="form-group">
                <label>Stream Name</label>
                <input type="text" name="streamName" required>
            </div>

            <div class="form-group">
                <label>Source Email</label>
                <input type="text" name="email" required>
            </div>

            <div class="form-group">
                <label>Data Format Schema</label>
                <input type="text" name="dataSchema" placeholder="e.g., JSON, XML, CSV" required>
            </div>

            <div class="form-group">
                <label>Access Secret Token</label>
                <input type="password" name="password" required>
            </div>

            <div class="form-group">
                <label>Confirm Secret Token</label>
                <input type="password" name="confirmPassword" required>
            </div>

            <input type="submit" value="CONNECT WEAVE" class="submit-btn">

        </form>
    </div>

</body>
</html>
