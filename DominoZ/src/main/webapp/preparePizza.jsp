<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ps" %>

<html>

<head>

    <title>Prepare Pizza</title>

    <style>

        body {
            margin: 0;
            background-color: #f4f6f8;
            font-family: Arial, sans-serif;
        }

        .form-container {
            width: 400px;
            margin: 60px auto;
            background-color: white;
            padding: 30px;
            border: 1px solid #ddd;
        }

        h2 {
            text-align: center;
            color: #2c3e50;
        }

        label {
            display: block;
            margin-top: 20px;
            margin-bottom: 7px;
            font-weight: bold;
        }

        select {
            width: 100%;
            padding: 10px;
            border: 1px solid #aaa;
        }

        button {
            width: 100%;
            margin-top: 25px;
            padding: 10px;
            background-color: #3498db;
            color: white;
            border: none;
            cursor: pointer;
        }

    </style>

</head>

<body>

    <div class="form-container">

        <h2>Pizza Maker</h2>

        <form action="pizzaMaker" method="post">


            <label>Employee Name</label>

            <select name="empName">
                <option value="">Select Employee</option>
                <ps:forEach items="${employees}" var="emp">

                    <option value="${emp.getName()}">
                        ${emp.getName()}
                    </option>

                </ps:forEach>

            </select>


            <label>Pizza Names</label>

            <select name="pizzaName">
                <option value="">Select Pizza</option>
                <ps:forEach items="${pizzas}" var="pizza">

                    <option value="${pizza.getName()}">
                        ${pizza.getName()}, ${pizza.getSize()}
                    </option>

                </ps:forEach>

            </select>



            <button type="submit">
                Submit
            </button>

        </form>

    </div>

</body>

</html>