
<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>Customer Updated</title>

    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet">

    <style>

        body {
            background: #f7f9fc;
            font-family: 'Segoe UI', sans-serif;
        }

        .customer-container {
            max-width: 600px;
            margin: 60px auto;
        }

        .customer-card {
            border: none;
            border-radius: 12px;
            box-shadow: 0px 8px 25px rgba(0, 0, 0, 0.1);
        }

        .card-header {
            background: linear-gradient(135deg, #198754, #28a745);
            color: white;
            text-align: center;
            padding: 25px;
            border-radius: 12px 12px 0 0 !important;
        }

        .info-row {
            padding: 12px 0;
            border-bottom: 1px solid #eee;
        }

        .info-label {
            font-weight: 600;
            color: #555;
        }

        .info-value {
            color: #222;
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


    <!-- UPDATED CUSTOMER -->

    <div class="container customer-container">

        <div class="card customer-card">

            <div class="card-header">

                <h2>Customer Updated Successfully!</h2>

                <p class="mb-0">
                    The customer information has been updated.
                </p>

            </div>


            <div class="card-body p-4">

                <!-- Customer ID -->

                <div class="row info-row">

                    <div class="col-5 info-label">
                        Customer ID
                    </div>

                    <div class="col-7 info-value">
                        ${customer.cid}
                    </div>

                </div>


                <!-- First Name -->

                <div class="row info-row">

                    <div class="col-5 info-label">
                        First Name
                    </div>

                    <div class="col-7 info-value">
                        ${customer.fname}
                    </div>

                </div>


                <!-- Last Name -->

                <div class="row info-row">

                    <div class="col-5 info-label">
                        Last Name
                    </div>

                    <div class="col-7 info-value">
                        ${customer.lname}
                    </div>

                </div>


                <!-- City -->

                <div class="row info-row">

                    <div class="col-5 info-label">
                        City
                    </div>

                    <div class="col-7 info-value">
                        ${customer.city}
                    </div>

                </div>


                <!-- Buttons -->

                <div class="text-center mt-4">

                    <a href="${pageContext.request.contextPath}/customers"
                       class="btn btn-primary me-2">
                        View All Customers
                    </a>

                    <a href="${pageContext.request.contextPath}/customers/add"
                       class="btn btn-success">
                        Add New Customer
                    </a>

                </div>

            </div>

        </div>

    </div>


</body>

</html>
