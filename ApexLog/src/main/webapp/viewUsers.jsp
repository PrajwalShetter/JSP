<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ps" %>

<html>

<head>
    <title>User Management</title>
</head>

<body style="
    margin: 0;
    padding: 0;
    background-color: #f4f6f8;
    font-family: Arial, Helvetica, sans-serif;
">

    <!-- Main Container -->
    <div style="
        width: 90%;
        margin: 40px auto;
    ">

        <!-- Heading Section -->
        <div style="
            background-color: #2c3e50;
            color: white;
            padding: 20px 25px;
            border-radius: 8px 8px 0 0;
        ">

            <h1 style="
                margin: 0;
                font-size: 26px;
            ">
                User Management
            </h1>

            <p style="
                margin: 8px 0 0;
                color: #dfe6e9;
                font-size: 14px;
            ">
                Manage registered users
            </p>

        </div>


        <!-- Table Container -->
        <div style="
            background-color: white;
            padding: 20px;
            border-radius: 0 0 8px 8px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.12);
        ">

            <table style="
                width: 100%;
                border-collapse: collapse;
                text-align: center;
            ">

                <!-- Table Header -->
                <tr style="
                    background-color: #ecf0f1;
                    color: #2c3e50;
                ">

                    <th style="
                        padding: 14px;
                        border-bottom: 2px solid #bdc3c7;
                    ">
                        ID
                    </th>

                    <th style="
                        padding: 14px;
                        border-bottom: 2px solid #bdc3c7;
                    ">
                        User Name
                    </th>

                    <th style="
                        padding: 14px;
                        border-bottom: 2px solid #bdc3c7;
                    ">
                        Email
                    </th>

                    <th style="
                        padding: 14px;
                        border-bottom: 2px solid #bdc3c7;
                    ">
                        Gender
                    </th>

                    <th style="
                        padding: 14px;
                        border-bottom: 2px solid #bdc3c7;
                    ">
                        Account Type
                    </th>

                    <th style="
                        padding: 14px;
                        border-bottom: 2px solid #bdc3c7;
                    ">
                        Actions
                    </th>

                </tr>


                <!-- Dynamic Users -->
                <ps:forEach items="${dtos}" var="dto">

                    <tr style="
                        background-color: white;
                    ">

                        <td style="
                            padding: 13px;
                            border-bottom: 1px solid #ecf0f1;
                            font-weight: bold;
                        ">
                            ${dto.getId()}
                        </td>


                        <td style="
                            padding: 13px;
                            border-bottom: 1px solid #ecf0f1;
                        ">
                            ${dto.getUserName()}
                        </td>


                        <td style="
                            padding: 13px;
                            border-bottom: 1px solid #ecf0f1;
                            color: #555;
                        ">
                            ${dto.getEmail()}
                        </td>


                        <td style="
                            padding: 13px;
                            border-bottom: 1px solid #ecf0f1;
                        ">
                            ${dto.getGender()}
                        </td>


                        <td style="
                            padding: 13px;
                            border-bottom: 1px solid #ecf0f1;
                        ">
                            <span style="
                                background-color: #e8f4fd;
                                color: #2980b9;
                                padding: 6px 12px;
                                border-radius: 15px;
                                font-size: 13px;
                                font-weight: bold;
                            ">
                                ${dto.getAccountType()}
                            </span>
                        </td>


                        <!-- Actions -->
                        <td style="
                            padding: 13px;
                            border-bottom: 1px solid #ecf0f1;
                        ">
                            <a type="submit" href="getUser?id=${dto.getId()}"
                                style="
                                    background-color: #f39c12;
                                    color: white;
                                    border: none;
                                    padding: 8px 14px;
                                    border-radius: 5px;
                                    cursor: pointer;
                                    margin-right: 5px;
                                ">
                                Edit
                            </a>


                            <a type="submit" href="delete?id=${dto.getId()}"
                                style="
                                    background-color: #e74c3c;
                                    color: white;
                                    border: none;
                                    padding: 8px 14px;
                                    border-radius: 5px;
                                    cursor: pointer;
                                ">
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