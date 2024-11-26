<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Products - RevShop</title>
    <style>
        /* Add your CSS styling here */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
        }

        h1 {
            text-align: center;
            margin-top: 20px;
        }

        .search-container {
            text-align: center;
            margin: 20px 0;
        }

        .product-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 20px;
            margin: 20px;
        }

        .product {
            border: 1px solid #ddd;
            padding: 20px;
            background-color: white;
            width: 300px;
            text-align: center;
        }

        .product img {
            max-width: 100%;
            height: auto;
        }

        .add-to-cart, .buy-now {
            margin-top: 10px;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }

        .add-to-cart:hover, .buy-now:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <h1>Welcome to RevShop Products</h1>

    <div class="search-container">
        <form action="products" method="get">
            <input type="text" name="query" placeholder="Search for products...">
            <button type="submit">Search</button>
        </form>
    </div>

    <div class="product-container">
        <c:forEach var="product" items="${products}">
            <div class="product">
                <img src="${product.product_image}" alt="${product.product_name} Image">
                <h2>${product.product_name}</h2>
                <p class="description">${product.product_description}</p>
                <p class="price">Price: ₹<span>${product.product_price}</span></p>

                <!-- Add to Cart form -->
                <form action="cart/add" method="post">
                    <input type="hidden" name="productId" value="${product.product_id}">
                    <input type="number" name="quantity" value="1" min="1">
                    <button type="submit" class="add-to-cart">Add to Cart</button>
                </form>

                <!-- Buy Now Button -->
                <form action="checkout" method="post">
                    <input type="hidden" name="productId" value="${product.product_id}">
                    <button type="submit" class="buy-now">Buy Now</button>
                </form>
            </div>
        </c:forEach>
    </div>

</body>
</html>
