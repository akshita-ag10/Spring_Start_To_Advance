<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info 2</title>

<!-- Bootstrap 5 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background: #f7f9fc;
        font-family: 'Segoe UI', sans-serif;
    }

    .info-card {
        background: white;
        border-radius: 12px;
        padding: 30px;
        box-shadow: 0 4px 20px rgba(0,0,0,0.08);
        margin-top: 60px;
        transition: 0.3s;
    }

    .info-card:hover {
        transform: translateY(-5px);
        box-shadow: 0 6px 24px rgba(0,0,0,0.12);
    }

    .header-title {
        font-size: 28px;
        font-weight: 600;
        color: #007bff;
    }

    .course-text {
        font-size: 20px;
        margin-top: 10px;
        color: #333;
    }

    .btn-custom {
        margin-top: 25px;
        padding: 10px 25px;
        font-size: 18px;
        border-radius: 8px;
    }
</style>

</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">AptitudeApp</a>
  </div>
</nav>

<!-- Content -->
<div class="container">
    <div class="info-card">

        <div class="text-center">
            <h2 class="header-title">User Course Summary</h2>
            <p class="course-text">
                <strong>${name}</strong> has enrolled in the  
                <span class="text-primary"><strong>${course}</strong></span> course.
            </p>

            <a href="/greetingsapp/home" class="btn btn-primary btn-custom">
                🔙 Back to Home
            </a>

            <a href="/greetingsapp/books" class="btn btn-outline-primary btn-custom">
                📚 View Recommended Books
            </a>
        </div>

    </div>
</div>

<!-- Footer -->
<footer class="text-center mt-5 mb-3 text-muted">
    © 2025 AptitudeApp - All Rights Reserved
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
