
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Added</title>

    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet">

    <style>
        body {
            background: #f7f9fc;
            font-family: 'Segoe UI', sans-serif;
        }

        .customer-container {
            max-width: 650px;
            margin: 60px auto;
        }

        .customer-card {
            border: none;
            border-radius: 12px;
            box-shadow: 0px 8px 25px rgba(0, 0, 0, 0.1);
        }

        .card-header {
            background: linear-gradient(135deg, #28a745, #5cb85c);
            color: white;
            text-align: center;
            padding: 25px;
            border-radius: 12px 12px 0 0 !important;
        }

        .customer-details {
            font-size: 18px;
        }

        .customer-details span {
            font-weight: 600;
        }
    </style>
</head>

<body>

    <!-- NAVBAR -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand"
               href="${pageContext.request.contextPath}/home">
                AptitudeApp
            </a>
        </div>
    </nav>


    <!-- CUSTOMER ADDED -->
    <div class="container customer-container">

        <div class="card customer-card">

            <div class="card-header">
                <h2>Customer Added Successfully!</h2>
                <p class="mb-0">Customer has been registered</p>
            </div>

            <div class="card-body p-4">

                <div class="customer-details">

                    <p>
                        <span>Customer ID:</span>
                        ${customer.cid}
                    </p>

                    <p>
                        <span>First Name:</span>
                        ${customer.fname}
                    </p>

                    <p>
                        <span>Last Name:</span>
                        ${customer.lname}
                    </p>

                    <p>
                        <span>City:</span>
                        ${customer.city}
                    </p>

                </div>

                <div class="text-center mt-4">

                    <a href="${pageContext.request.contextPath}/customers"
                       class="btn btn-primary">
                        View All Customers
                    </a>

                    <a href="${pageContext.request.contextPath}/customers/add"
                       class="btn btn-success ms-2">
                        Add Another Customer
                    </a>

                </div>

            </div>
        </div>
    </div>

</body>
</html>
