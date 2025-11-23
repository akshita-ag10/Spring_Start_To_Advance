<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Details</title>

<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background: #f7f9fc;
        font-family: 'Segoe UI', sans-serif;
    }

    .hero {
        background: linear-gradient(135deg, #4A90E2, #007bff);
        color: white;
        padding: 60px 20px;
        text-align: center;
        border-radius: 8px;
        margin-top: 25px;
    }

    .detail-card {
        margin-top: 30px;
        border-radius: 10px;
        padding: 25px;
        box-shadow: 0 6px 16px rgba(0,0,0,0.1);
        transition: 0.3s;
    }

    .detail-card:hover {
        transform: translateY(-5px);
        box-shadow: 0 10px 24px rgba(0,0,0,0.15);
    }

    .footer {
        background: #111;
        color: #aaa;
        padding: 20px;
        text-align: center;
        margin-top: 40px;
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
        <li class="nav-item"><a class="nav-link" href="#">Tests</a></li>
        <li class="nav-item"><a class="nav-link" href="/books">Books</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Login</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- HERO -->
<div class="container">
    <div class="hero">
        <h1 class="display-5">Quantitative Aptitude Course</h1>
        <p class="lead">Enhance your logical and mathematical skills with this structured course.</p>
    </div>

    <!-- COURSE DETAILS CARD -->
    <div class="card detail-card">
        <h4 class="mb-3">📘 Course Details</h4>

        <p><strong>Course ID:</strong> ${course.cId}</p>
        <p><strong>Name:</strong> ${course.cName}</p>
        <p><strong>Description:</strong> ${course.cDesp}</p>
        <p><strong>Price:</strong> ₹ ${course.cPrice}</p>

        <a href="/books" class="btn btn-primary mt-3">View Related Books</a>
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
