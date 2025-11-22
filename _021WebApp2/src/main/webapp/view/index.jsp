<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aptitude Portal</title>

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

    .feature-card {
        transition: 0.3s;
    }

    .feature-card:hover {
        transform: translateY(-6px);
        box-shadow: 0px 8px 18px rgba(0,0,0,0.15);
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
        <li class="nav-item"><a class="nav-link active" href="#">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Tests</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Results</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Login</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- HERO SECTION -->
<div class="container">
    <div class="hero">
        <h1 class="display-4">${message}</h1>
        <p class="lead">Sharpen your skills with our aptitude test platform.</p>
        <a href="#" class="btn btn-light btn-lg mt-3">Start Now</a>
    </div>

    <!-- FEATURES SECTION -->
    <div class="row mt-5">
        <div class="col-md-4 mb-4">
            <div class="card p-3 feature-card">
                <h5>📘 Topic-wise Tests</h5>
                <p>Practice tests in Quantitative, Logical, Verbal and more.</p>
            </div>
        </div>

        <div class="col-md-4 mb-4">
            <div class="card p-3 feature-card">
                <h5>📊 Instant Results</h5>
                <p>Get detailed performance analytics and improvement tips.</p>
            </div>
        </div>

        <div class="col-md-4 mb-4">
            <div class="card p-3 feature-card">
                <h5>⏱️ Timed Mock Exams</h5>
                <p>Take real-time exam simulations to boost confidence.</p>
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
