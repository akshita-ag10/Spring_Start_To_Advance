<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AptitudeApp - Home</title>

<!-- Bootstrap 5 CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background: #f7f9fc;
        font-family: 'Segoe UI', sans-serif;
    }

    .hero {
        background: linear-gradient(135deg, #4A90E2, #007bff);
        color: white;
        padding: 80px 20px;
        text-align: center;
        border-radius: 8px;
        margin-top: 30px;
    }

    .footer {
        background: #111;
        color: #aaa;
        padding: 20px;
        text-align: center;
        margin-top: 40px;
    }

    .btn-custom {
        background: white;
        color: #007bff;
        font-weight: 600;
        padding: 12px 28px;
        border-radius: 6px;
        transition: 0.3s;
    }

    .btn-custom:hover {
        background: #e9ecef;
        transform: translateY(-3px);
    }
</style>
</head>
<body>

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="/greetingsapp/home">AptitudeApp</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
            data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ms-auto">
        <li class="nav-item"><a class="nav-link active" href="/greetingsapp/home">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Tests</a></li>
        <li class="nav-item"><a class="nav-link" href="/greetingsapp/books">Books</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Login</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- HERO SECTION -->
<div class="container">
    <div class="hero">
        <h1 class="display-4">Welcome to AptitudeApp</h1>
        <p class="lead">Sharpen your reasoning and aptitude skills with curated practice material.</p>

        <!-- Button to navigate to the Books page -->
        <a href="/books" class="btn btn-custom mt-3">View Books</a>
    </div>
</div>

<!-- FOOTER -->
<div class="footer">
    © 2025 AptitudeApp - All Rights Reserved
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
