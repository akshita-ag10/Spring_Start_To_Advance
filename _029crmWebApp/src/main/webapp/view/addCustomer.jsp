
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- we need to add this, since we are using form tag lig for 2 way binding --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Customer</title>

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
            background: linear-gradient(135deg, #007bff, #4A90E2);
            color: white;
            text-align: center;
            padding: 25px;
            border-radius: 12px 12px 0 0 !important;
        }

        .form-label {
            font-weight: 500;
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


    <!-- ADD CUSTOMER FORM -->
    <div class="container customer-container">

        <div class="card customer-card">

            <div class="card-header">
                <h2>Add Customer</h2>
                <p class="mb-0">Register a new customer</p>
            </div>

            <div class="card-body p-4">

                <form:form action="${pageContext.request.contextPath}/customers/add"
                      method="post" modelAttribute="customer">

                    <!-- First Name -->
                    <div class="mb-3">
                        <label for="fname" class="form-label">
                            First Name
                        </label>

                        <form:input
                               path="fname"
                               class="form-control"
                               id="fname"
                               placeholder="Enter first name"
                               />
                    </div>


                    <!-- Last Name -->
                    <div class="mb-3">
                        <label for="lname" class="form-label">
                            Last Name
                        </label>

                        <form:input 
                               path="lname"
                               class="form-control"
                               id="lname"
                               placeholder="Enter last name"
                               />
                    </div>


                    <!-- City -->
                    <div class="mb-3">
                        <label for="city" class="form-label">
                            City
                        </label>

                        <form:input path="city"
                               class="form-control"
                               id="city"
                               placeholder="Enter city"
                               />
                    </div>


                    <!-- Buttons -->
                    <div class="text-center mt-4">

                        <button type="submit"
                                class="btn btn-success me-2">
                            Register Customer
                        </button>

                        <a href="${pageContext.request.contextPath}/customers"
                           class="btn btn-secondary">
                            Cancel
                        </a>

                    </div>

                </form:form>

            </div>
        </div>
    </div>

</body>
</html>
