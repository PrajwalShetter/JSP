<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>AuraMarket - Premium Essentials</title>
    <style>
        /* Base Configuration Layout */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f9fa;
            color: #212529;
        }

        /* Top Header Navigation bar */
        header {
            background-color: #ffffff;
            padding: 15px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 1px solid #e9ecef;
        }
        .brand {
            display: flex;
            align-items: center;
        }
        .brand img {
            width: 28px;
            height: 28px;
            margin-right: 10px;
        }
        .brand span {
            font-size: 20px;
            font-weight: bold;
            color: #1a365d; /* Dark navy brand identifier */
        }
        .nav-links a {
            color: #495057;
            text-decoration: none;
            margin-left: 20px;
            font-size: 14px;
        }
        .nav-links a:hover {
            color: #0056b3;
        }

        /* Hero Promotion Banner Row */
        .promo-banner {
            background-color: #e3fafc; /* Subtle ice blue accent block */
            border: 1px solid #c5f6fa;
            max-width: 1200px;
            margin: 30px auto;
            padding: 30px;
            border-radius: 6px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .banner-text h1 {
            font-size: 26px;
            margin: 0 0 10px 0;
            color: #0c8599;
        }
        .banner-text p {
            font-size: 14px;
            margin: 0;
            color: #1098ad;
        }
        .promo-banner button {
            background-color: #1a365d; /* Highlight color action */
            color: #ffffff;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
        }

        /* Catalog Display Shell */
        .catalog-container {
            max-width: 1200px;
            margin: 0 auto 50px auto;
            padding: 0 20px;
        }
        .section-heading {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 20px;
            border-bottom: 2px solid #dee2e6;
            padding-bottom: 8px;
        }
        .product-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(260px, 1fr));
            gap: 25px;
        }

        /* Product Cards Structure */
        .product-card {
            background-color: #ffffff;
            border: 1px solid #dee2e6;
            border-radius: 6px;
            overflow: hidden;
            display: flex;
            flex-direction: column;
        }
        .img-wrapper {
            background-color: #e9ecef;
            width: 100%;
            aspect-ratio: 4/3;
        }
        .img-wrapper img {
            width: 100%;
            height: 100%;
            object-fit: cover;
            display: block;
        }
        .product-details {
            padding: 15px;
            display: flex;
            flex-direction: column;
            flex-grow: 1;
        }
        .product-name {
            font-size: 15px;
            font-weight: bold;
            margin: 0 0 8px 0;
        }
        .product-price {
            font-size: 16px;
            color: #1a365d;
            font-weight: bold;
            margin: 0 0 15px 0;
        }
        .add-btn {
            background-color: transparent;
            border: 1px solid #1a365d;
            color: #1a365d;
            padding: 8px;
            border-radius: 4px;
            font-size: 13px;
            font-weight: bold;
            cursor: pointer;
            text-align: center;
            margin-top: auto;
            transition: background-color 0.2s;
        }
        .add-btn:hover {
            background-color: #1a365d;
            color: #ffffff;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header -->
    <header>
        <div class="brand">
            <img src="${pageContext.request.contextPath}/images/shop-logo.png" alt="Store Logo">
            <span>AuraMarket</span>
        </div>
        <div class="nav-links">
            <a href="catalog.jsp">All Products</a>
            <a href="getUser.jsp">user Profile</a>
            <a href="cart.jsp" style="font-weight: bold;">Cart (0)</a>
            <a href="signUp.jsp">signUp</a>
        </div>
    </header>

    <!-- Mid Promotional Row -->
    <div class="promo-banner">
        <div class="banner-text">
            <h1>Mid-Season Flash Sale</h1>
            <p>Get up to 20% off on all workspace hardware utilities this week.</p>
        </div>
        <button onclick="location.href='catalog.jsp'">Browse Sale</button>
    </div>

    <!-- Product Catalog Section Grid -->
    <div class="catalog-container">
        <h2 class="section-heading">Featured Collection</h2>

        <div class="product-grid">

            <!-- Item 1 -->
            <div class="product-card">
                <div class="img-wrapper">
                    <img src="${pageContext.request.contextPath}/images/item-1.jpg" alt="Minimalist Mechanical Keyboard product snapshot">
                </div>
                <div class="product-details">
                    <h3 class="product-name">Minimalist Mechanical Keyboard</h3>
                    <p class="product-price">₹4,499.00</p>
                    <button class="add-btn">Add to Cart</button>
                </div>
            </div>

            <!-- Item 2 -->
            <div class="product-card">
                <div class="img-wrapper">
                    <img src="${pageContext.request.contextPath}/images/item-2.jpg" alt="Ergonomic Aluminum Laptop Stand product snapshot">
                </div>
                <div class="product-details">
                    <h3 class="product-name">Aluminum Laptop Stand</h3>
                    <p class="product-price">₹1,850.00</p>
                    <button class="add-btn">Add to Cart</button>
                </div>
            </div>

            <!-- Item 3 -->
            <div class="product-card">
                <div class="img-wrapper">
                    <img src="${pageContext.request.contextPath}/images/item-3.jpg" alt="Matte Black Water Bottle insulation flask product snapshot">
                </div>
                <div class="product-details">
                    <h3 class="product-name">Insulated Smart Flask</h3>
                    <p class="product-price">₹1,200.00</p>
                    <button class="add-btn">Add to Cart</button>
                </div>
            </div>

        </div>
    </div>


</body>
</html>
