<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Account Registration</title>
    <style>
        /* Plain Layout Construction */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #ffffff;
            color: #111111;
        }

        /* Centered Form Wrapper Block */
        .form-container {
            max-width: 450px;
            margin: 60px auto;
            padding: 30px;
            border: 1px solid #dddddd;
            border-radius: 6px;
        }
        .form-container h2 {
            font-size: 22px;
            font-weight: bold;
            margin: 0 0 20px 0;
            border-bottom: 1px solid #dddddd;
            padding-bottom: 10px;
        }

        /* Stacked Input Row Styling */
        .form-group {
            margin-bottom: 16px;
        }
        .form-group label {
            display: block;
            font-size: 14px;
            font-weight: bold;
            margin-bottom: 6px;
            color: #444444;
        }
        .form-group input[type="text"],
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
            background-color: #1a365d; /* Professional Deep Blue */
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
    </style>
</head>
<body>

    <div class="form-container">
        <h2>Create New Account</h2>

        <form action="register" method = "">

            <div class="form-group">
                <label>Email Address</label>
                <input type="text" name="EmailId" required>
            </div>

            <div class="form-group">
                <label>First Name</label>
                <input type="text" name="firstname" required>
            </div>

            <div class="form-group">
                <label>Last Name</label>
                <input type="text" name="lastname" required>
            </div>

            <div class="form-group">
                <label>Blood Group</label>
                <input type="text" name="bloodGroup" placeholder="e.g., O+, A-">
            </div>



            <div class="form-group">
                <label>Password</label>
                <!-- Changed type to 'password' to hide character inputs -->
                <input type="password" name="password" required>
            </div>

            <div class="form-group">
                <label>Repeat Password</label>
                <!-- Changed type to 'password' to hide character inputs -->
                <input type="password" name="repeatPassword" required>
            </div>

            <input type="submit" value="SUBMIT" class="submit-btn">

        </form>
    </div>

</body>
</html>
