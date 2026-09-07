<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
            <html>

            <head>
                <title>Employees</title>

                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
            </head>

            <body>

             <div class="container mt-5">

                                <div class="card shadow">

                                    <div class="card-header bg-danger text-white text-center">
                                        <h3 class="mb-0">Employees</h3>
                                    </div>

                                    <div class="card-body">

                                        <div class="table-responsive">

                                            <table class="table table-bordered table-hover text-center align-middle">

                                                <thead class="table-dark">
                                                    <tr>
                                                        <th>Id</th>
                                                        <th>Name</th>
                                                        <th>Email</th>
                                                        <th>Phone</th>
                                                        <th>Age</th>
                                                        <th>Gender</th>
                                                         <th>Salary</th>
                                                        <th>Action</th>
                                                    </tr>
                                                </thead>

                                                <tbody>

                                                    <c:forEach items="${empDto}" var="dto" >

                                                        <tr>
                                                            <td>${dto.getId()}</td>
                                                            <td>${dto.getName()}</td>
                                                            <td>${dto.getEmail()}</td>
                                                            <td>${dto.getPhone()}</td>
                                                            <td> ${dto.getAge()}</td>
                                                            <td> ${dto.getGender()}</td>
                                                            <td>₹ ${dto.getSalary()}</td>
                                                            <td><a href="deleteEmployee?id=${dto.id}" > DELETE</a>
                                                            <a href="editEmployee?id=${dto.id}">EDIT</a>
                                                            </td>
                                                        </tr>

                                                    </c:forEach>

                                                </tbody>

                                            </table>

                                        </div>
                                    </div>

                                </div>

             </div>

             </html>