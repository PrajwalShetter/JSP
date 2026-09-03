<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Add Pizza</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>

<div class="container mt-5">

    <div class="row justify-content-center">

        <div class="col-md-6">

            <div class="card shadow">

                <div class="card-header text-center bg-danger text-white">
                    <h3>Add Pizza</h3>
                </div>

                <div class="card-body">

                    <form action="addPizza" method="post">

                        <!-- Name -->
                        <div class="mb-3">
                            <label class="form-label">Pizza Name</label>
                            <input type="text"
                                   name="name"
                                   class="form-control"
                                   placeholder="Enter pizza name"
                                   required>
                        </div>

                        <!-- Size -->
                        <div class="mb-3">
                            <label class="form-label">Size</label>

                            <select name="size" class="form-select" required>
                                <option value="">Select Size</option>
                                <option value="SMALL">Small</option>
                                <option value="MEDIUM">Medium</option>
                                <option value="LARGE">Large</option>
                            </select>
                        </div>

                        <!-- Category -->
                        <div class="mb-3">
                            <label class="form-label">Category</label>

                            <select name="category" class="form-select" required>
                                <option value="">Select Category</option>
                                <option value="VEG">Veg</option>
                                <option value="NONVEG">NonVeg</option>
                            </select>
                        </div>

                        <!-- Price -->
                        <div class="mb-3">
                            <label class="form-label">Price</label>

                            <input type="number"
                                   name="price"
                                   class="form-control"
                                   placeholder="Enter price"
                                   step="0.01"
                                   min="0"
                                   required>
                        </div>

                        <!-- Submit -->
                        <div class="d-grid">
                            <button type="submit"
                                    class="btn btn-danger">
                                Add Pizza
                            </button>
                        </div>

                    </form>

                </div>

            </div>

        </div>

    </div>

</div>

</body>
</html>