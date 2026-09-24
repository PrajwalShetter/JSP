<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ps" %>

<html>

<head>

    <title>View All Warehouses</title>

    <style>

        body {
            margin: 0;
            padding: 0;
            background-color: #f4f6f8;
            font-family: Arial, sans-serif;
        }

        .container {
            width: 90%;
            margin: 40px auto;
        }

        .heading {
            background-color: #2c3e50;
            color: white;
            padding: 20px;
            text-align: center;
        }

        .heading h1 {
            margin: 0;
            font-size: 28px;
        }

        .heading p {
            margin: 8px 0 0;
            font-size: 14px;
            color: #dfe6e9;
        }

        .table-container {
            background-color: white;
            padding: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th {
            background-color: #ecf0f1;
            color: #2c3e50;
            padding: 12px;
            border: 1px solid #bdc3c7;
            text-align: center;
        }

        td {
            padding: 12px;
            border: 1px solid #bdc3c7;
            text-align: center;
        }

        tr:hover {
            background-color: #f8f9fa;
        }

        .id {
            font-weight: bold;
        }

        .capacity {
            font-weight: bold;
            color: #2980b9;
        }

        .region {
            background-color: #e8f4fd;
            color: #2980b9;
            padding: 5px 10px;
            border-radius: 12px;
            font-weight: bold;
        }

        .view-btn {
            background-color: #3498db;
            color: white;
            border: none;
            padding: 7px 12px;
            cursor: pointer;
            margin-right: 4px;
        }

        .edit-btn {
            background-color: #f39c12;
            color: white;
            border: none;
            padding: 7px 12px;
            cursor: pointer;
            margin-right: 4px;
        }

        .delete-btn {
            background-color: #e74c3c;
            color: white;
            border: none;
            padding: 7px 12px;
            cursor: pointer;
        }

        .view-btn:hover {
            background-color: #2980b9;
        }

        .edit-btn:hover {
            background-color: #d68910;
        }

        .delete-btn:hover {
            background-color: #c0392b;
        }

    </style>

</head>

<body>

    <div class="container">

        <div class="heading">

            <h1>View All Warehouses</h1>

            <p>Manage registered warehouse details</p>

        </div>

        <div class="table-container">

            <table>

                <tr>

                    <th>ID</th>
                    <th>Email</th>
                    <th>Vault Capacity</th>
                    <th>Station ID</th>
                    <th>Region Code</th>
                    <th>Actions</th>

                </tr>

                <ps:forEach items="${warehouse}" var="dto">

                    <tr>

                        <td class="id">
                            ${dto.getId()}
                        </td>

                        <td>
                            ${dto.getEmail()}
                        </td>

                        <td class="capacity">
                            ${dto.getVaultCapacity()}
                        </td>

                        <td>
                            ${dto.getStationId()}
                        </td>

                        <td>

                            <span class="region">
                                ${dto.getRegionCode()}
                            </span>

                        </td>

                        <td>

                            <a href = "edit?id=${dto.getId()}" class="edit-btn">
                                Edit
                            </a>

                            <a href="delete?id=${dto.getId()}" class="delete-btn">
                                Delete
                            </a>

                        </td>

                    </tr>

                </ps:forEach>

            </table>

        </div>

    </div>

</body>

</html>