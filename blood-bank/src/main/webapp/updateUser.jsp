```jsp
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
    </style>
</head>

<body>

<%@ include file="navbar.jsp" %>

<div class="form-container">

    <h2>Update User Account</h2>

    <form action="updateAccount" method="post">

        <input type="hidden"
               name="id"
               value="${updateDto.getUserId()}">

        <div class="form-group">

            <label>Email Address</label>

            <input type="text"
                   name="EmailId"
                   value="${updateDto.getEmail()}"
                   required>

        </div>


        <div class="form-group">

            <label>First Name</label>

            <input type="text"
                   name="firstname"
                   value="${updateDto.getFirstName()}"
                   required>

        </div>


        <div class="form-group">

            <label>Last Name</label>

            <input type="text"
                   name="lastname"
                   value="${updateDto.getLastName()}"
                   required>

        </div>


        <div class="form-group">

            <label for="bloodGroup">Blood Group</label>

            <select id="bloodGroup"
                    name="bloodGroup"
                    value="${updateDto.getBloodGroup()}"
                    class="form-select"
                    aria-label="Select Blood Group">

                <option value="" selected disabled>
                    Select your blood group
                </option>

                <option value="O+">O Positive (O+)</option>
                <option value="O-">O Negative (O-)</option>
                <option value="A+">A Positive (A+)</option>
                <option value="A-">A Negative (A-)</option>
                <option value="B+">B Positive (B+)</option>
                <option value="B-">B Negative (B-)</option>
                <option value="AB+">AB Positive (AB+)</option>
                <option value="AB-">AB Negative (AB-)</option>

            </select>

        </div>


        <input type="submit"
               value="SUBMIT"
               class="submit-btn">

    </form>

</div>

</body>
</html>
```

