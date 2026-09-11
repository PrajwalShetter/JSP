<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ page isELIgnored="false" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <!DOCTYPE html>
            <html>

            <head>
                <title>Order Pizza</title>

                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
            </head>

            <body>

                <div class="container mt-5">

                    <div class="row justify-content-center">

                        <div class="col-md-6">

                            <div class="card shadow">

                                <div class="card-header text-center bg-danger text-white">
                                    <h3>Order Pizza</h3>
                                </div>

                                <div class="card-body">

                                    <!-- =========================
                         CATEGORY FORM
                         ========================= -->

                                    <form action="getPizzaByCategory" method="get">

                                        <!-- User Name -->
                                        <div class="mb-3">
                                            <label class="form-label">User Name</label>

                                            <input type="text" name="name" class="form-control"
                                                placeholder="Enter Your Name" value="${param.name}" required>
                                        </div>


                                        <!-- Phone -->
                                        <div class="mb-3">
                                            <label class="form-label">Phone Number</label>

                                            <input type="text" name="phone" class="form-control"
                                                placeholder="Enter Your Phone" value="${param.phone}" required>
                                        </div>


                                        <!-- Category -->
                                        <div class="mb-3">

                                            <label class="form-label">Category</label>

                                            <select name="category" class="form-select" required>

                                                <option value="">Select Category</option>

                                                <option value="VEG" ${param.category=='VEG' ? 'selected' : '' }>
                                                    Veg
                                                </option>

                                                <option value="NONVEG" ${param.category=='NONVEG' ? 'selected' : '' }>
                                                    NonVeg
                                                </option>

                                            </select>

                                        </div>


                                        <!-- Get Pizza Button -->
                                        <div class="d-grid">
                                            <button type="submit" class="btn btn-secondary">
                                                Get Pizza
                                            </button>
                                        </div>

                                    </form>


                                    <!-- =========================
                         ORDER FORM
                         ========================= -->

                                    <c:if test="${not empty categoryDto}">

                                        <form action="orderPizza" method="post">

                                            <!-- Preserve Name -->
                                            <input type="hidden" name="name" value="${param.name}">


                                            <!-- Preserve Phone -->
                                            <input type="hidden" name="phone" value="${param.phone}">


                                            <!-- Preserve Category -->
                                            <input type="hidden" name="category" value="${param.category}">


                                            <!-- Pizza Name -->
                                            <div class="mb-3 mt-3">

                                                <label class="form-label">
                                                    Pizza Name
                                                </label>

                                                <select name="pizzaName" class="form-select" required>

                                                    <option value="">
                                                        Select Pizza
                                                    </option>

                                                    <c:forEach items="${categoryDto}" var="dto">

                                                        <option value="${dto.getName()}">
                                                            ${dto.getName()}
                                                        </option>

                                                    </c:forEach>

                                                </select>

                                            </div>


                                            <!-- Submit -->
                                            <div class="d-grid">

                                                <button type="submit" class="btn btn-danger">
                                                    Order Pizza
                                                </button>

                                            </div>

                                        </form>

                                    </c:if>

                                </div>

                            </div>

                        </div>

                    </div>

                </div>

            </body>

            </html>
            ```