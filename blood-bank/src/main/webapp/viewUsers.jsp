<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ps" %>

<html>
<body+>
<h2>Hello World!</h2>

<h1>View all Users</h1>
<center>
<table style="border-collapse: collapse; width: 85%; margin-top: 30px; font-family: Arial, sans-serif; box-shadow: 0 4px 12px rgba(0,0,0,0.15);">

    <tr style="background-color: #2c3e50; color: white;">
        <th style="padding: 12px; border: 1px solid #ddd;">Sl.No</th>
        <th style="padding: 12px; border: 1px solid #ddd;">Email</th>
        <th style="padding: 12px; border: 1px solid #ddd;">First Name</th>
        <th style="padding: 12px; border: 1px solid #ddd;">Last Name</th>
        <th style="padding: 12px; border: 1px solid #ddd;">Blood Group</th>
        <th style="padding: 12px; border: 1px solid #ddd;">Actions</th>
    </tr>

    <ps:forEach items="${dtos}" var="dto">

        <tr style="text-align: center; background-color: #ffffff;">

            <td style="padding: 10px; border: 1px solid #ddd;">
                ${dto.getUserId()}
            </td>

            <td style="padding: 10px; border: 1px solid #ddd;">
                ${dto.getEmail()}
            </td>

            <td style="padding: 10px; border: 1px solid #ddd;">
                ${dto.getFirstname()}
            </td>

            <td style="padding: 10px; border: 1px solid #ddd;">
                ${dto.getLastname()}
            </td>

            <td style="padding: 10px; border: 1px solid #ddd; font-weight: bold;">
                ${dto.getBloodGroup()}
            </td>

            <td style="padding: 10px; border: 1px solid #ddd;">

              <a href="getData?id=${dto.getUserId()}"> Edit</a>

                <a href="delete?id=${dto.getUserId()}">Delete</a>

            </td>

        </tr>

    </ps:forEach>

</table>
</center>
</body>
</html>