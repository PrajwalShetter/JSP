<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page isELIgnored="false" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <!DOCTYPE html>
            <html>

            <head>
                <title>Pizza List</title>

                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
            </head>

            <body>
                <form class="d-flex" action="getPizzaByPrice">
                    <input class="form-control me-2" type="search" placeholder="price" aria-label="Search" name="price">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>

                <form class="d-flex" action="getPizzaBySize">
                    <select name="size" class="form-select" required onchange="this.form.submit()">
                        <option value="">Select Size</option>
                        <option value="SMALL">Small</option>
                        <option value="MEDIUM">Medium</option>
                        <option value="LARGE">Large</option>
                    </select>

                </form>

                <form class="d-flex" action="getPizzaByCategory">
                    <select name="category" class="form-select" required onchange="this.form.submit()">
                        <option value="">Select Category</option>
                        <option value="VEG">Veg</option>
                        <option value="NONVEG">NonVeg</option>
                    </select>
                </form>
                <br>
                <br>

                <form action="overAllFilter">
                    <input value="0" type="search" name="price" placeholder="price">
                    <br>
                    <select name="size" class="form-select">
                        <option value="">Select Size</option>
                        <option value="SMALL">Small</option>
                        <option value="MEDIUM">Medium</option>
                        <option value="LARGE">Large</option>
                    </select>
                    <br>
                    <select name="category" class="form-select" >
                                            <option value="">Select Category</option>
                                            <option value="VEG">Veg</option>
                                            <option value="NONVEG">NonVeg</option>
                                        </select>


                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>

                <div class="container mt-5">

                    <div class="card shadow">

                        <div class="card-header bg-danger text-white text-center">
                            <h3 class="mb-0">Pizza List</h3>
                        </div>

                        <div class="card-body">

                            <div class="table-responsive">

                                <table class="table table-bordered table-hover text-center align-middle">

                                    <thead class="table-dark">
                                        <tr>
                                            <th>Sl.No</th>
                                            <th>Pizza Name</th>
                                            <th>Size</th>
                                            <th>Category</th>
                                            <th>Price</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>

                                    <tbody>

                                        <c:forEach items="${dtos}" var="dto" varStatus="status">

                                            <tr>
                                                <td>${status.count}</td>
                                                <td>${dto.name}</td>
                                                <td>${dto.size}</td>
                                                <td>${dto.category}</td>
                                                <td>₹ ${dto.price}</td>
                                                <td><a href="deletePizza?id=${dto.id}" > DELETE</a>
                                                <a href="editPizza?id=${dto.id}">EDIT</a>
                                                </td>
                                            </tr>

                                        </c:forEach>

                                        <c:forEach items="${priceDto}" var="dto" varStatus="status">

                                            <tr>
                                                <td>${status.count}</td>
                                                <td>${dto.id}</td>
                                                <td>${dto.name}</td>
                                                <td>${dto.size}</td>
                                                <td>${dto.category}</td>
                                                <td>₹ ${dto.price}</td>

                                            </tr>

                                        </c:forEach>


                                        <c:forEach items="${sizeDto}" var="dto" varStatus="status">

                                            <tr>
                                                <td>${status.count}</td>
                                                <td>${dto.name}</td>
                                                <td>${dto.size}</td>
                                                <td>${dto.category}</td>
                                                <td>₹ ${dto.price}</td>
                                            </tr>

                                        </c:forEach>


                                        <c:forEach items="${categoryDto}" var="dto" varStatus="status">

                                            <tr>
                                                <td>${status.count}</td>
                                                <td>${dto.name}</td>
                                                <td>${dto.size}</td>
                                                <td>${dto.category}</td>
                                                <td>₹ ${dto.price}</td>
                                            </tr>

                                        </c:forEach>

                                        <c:forEach items="${filterDto}" var="dto" varStatus="status">

                                                                                    <tr>
                                                                                        <td>${status.count}</td>
                                                                                        <td>${dto.name}</td>
                                                                                        <td>${dto.size}</td>
                                                                                        <td>${dto.category}</td>
                                                                                        <td>₹ ${dto.price}</td>
                                                                                    </tr>

                                                                                </c:forEach>


                                    </tbody>

                                </table>

                            </div>

                        </div>

                    </div>

                </div>

            </body>

            </html>