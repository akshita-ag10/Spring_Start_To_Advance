<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info</title>

<!-- Bootstrap 5 CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background: #f7f9fc;
        font-family: 'Segoe UI', sans-serif;
    }

    .page-header {
        background: linear-gradient(135deg, #4A90E2, #007bff);
        padding: 60px 20px;
        color: white;
        border-radius: 8px;
        text-align: center;
        margin-top: 20px;
    }

    .info-card {
        border-radius: 12px;
        padding: 25px;
        box-shadow: 0px 6px 16px rgba(0, 0, 0, 0.1);
        background: white;
        transition: 0.3s;
    }

    .info-card:hover {
        transform: translateY(-4px);
    }

    .footer {
        background: #111;
        color: #aaa;
        padding: 15px;
        margin-top: 40px;
        text-align: center;
    }
</style>
</head>

<body>

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">AptitudeApp</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
                data-bs-target="#navbarNav" aria-controls="navbarNav" 
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="/home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="/tests">Tests</a></li>
                <li class="nav-item"><a class="nav-link" href="/results">Results</a></li>
                <li class="nav-item"><a class="nav-link" href="/profile">Profile</a></li>
            </ul>
        </div>
    </div>
</nav>

<!-- PAGE HEADER -->
<div class="container">
    <div class="page-header mt-4">
        <h1 class="display-5">👤 User Information</h1>
    </div>

    <!-- USER CARD -->
    <div class="row justify-content-center mt-5">
        <div class="col-md-6">
            <div class="info-card text-center">
                <h2 class="fw-bold text-primary">${name}</h2>
                <p class="text-muted mt-2">
                    Welcome to AptitudeApp, your personalized learning portal.
                </p>

                <a href="/books" class="btn btn-primary mt-3">View Recommended Books</a>
            </div>
        </div>
    </div>
</div>

<!-- FOOTER -->
<div class="footer">
    © 2025 AptitudeApp - All Rights Reserved
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
