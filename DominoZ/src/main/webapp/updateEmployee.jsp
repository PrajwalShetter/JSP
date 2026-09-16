<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Add Employee</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
        }

        .container {
            width: 450px;
            margin: 40px auto;
            background-color: white;
            padding: 25px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
        }

        label {
            display: block;
            margin-top: 12px;
            margin-bottom: 5px;
        }

        input, select {
            width: 100%;
            padding: 9px;
            box-sizing: border-box;
        }

        button {
            width: 100%;
            padding: 10px;
            margin-top: 20px;
            background-color: #dc3545;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: #bb2d3b;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>Update Employee</h2>

    <form action="updateEmployee" method="post">

<input value="${dto.getId()}" hidden name="id">
        <label>Name</label>
        <input type="text"
               name="name"
               value="${dto.getName()}"
               placeholder="Enter employee name"
               required>

        <label>Email</label>
        <input type="email"
               name="email"
               value="${dto.getEmail()}"
               placeholder="Enter email"
               required>

        <label>Phone</label>
        <input type="number"
               name="phone"
               value="${dto.getPhone()}"
               placeholder="Enter phone number"
               required>

        <label>Age</label>
        <input type="number"
               name="age"
               value="${dto.getAge()}"
               placeholder="Enter age"
               required>

        <label>Gender</label>
        <select name="gender" required>
            <option value="">Select Gender</option>
            <option value="MALE">Male</option>
            <option value="FEMALE">Female</option>
        </select>

        <label>Salary</label>
        <input type="number"
               name="salary"
               value="${dto.getSalary()}"
               placeholder="Enter salary"
               step="0.01"
               required>

        <button type="submit">Update Employee</button>

    </form>

</div>

</body>
</html>