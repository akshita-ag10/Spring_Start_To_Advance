<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aptitude Tests</title>

<!-- Bootstrap 5 CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background: #f7f9fc;
        font-family: 'Segoe UI', sans-serif;
    }

    .page-header {
        text-align: center;
        padding: 50px 20px;
        margin-bottom: 30px;
        background: linear-gradient(135deg, #007bff, #4A90E2);
        color: white;
        border-radius: 8px;
    }

    .test-card {
        transition: 0.3s;
    }
    .test-card:hover {
        transform: translateY(-6px);
        box-shadow: 0px 8px 20px rgba(0,0,0,0.12);
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
        <li class="nav-item"><a class="nav-link active" href="/tests">Tests</a></li>
        <li class="nav-item"><a class="nav-link" href="/results">Results</a></li>
        <li class="nav-item"><a class="nav-link" href="/login">Login</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- HEADER -->
<div class="container">
    <div class="page-header">
        <h1 class="display-5">Choose Your Test</h1>
        <p class="lead">Practice topic-wise or attempt a full mock exam.</p>
    </div>

    <!-- FILTERS -->
    <div class="row mb-4">
        <div class="col-md-6">
            <select class="form-select">
                <option selected disabled>Choose Category</option>
                <option>Quantitative Aptitude</option>
                <option>Logical Reasoning</option>
                <option>Verbal Ability</option>
                <option>Data Interpretation</option>
            </select>
        </div>

        <div class="col-md-6">
            <select class="form-select">
                <option selected disabled>Difficulty Level</option>
                <option>Easy</option>
                <option>Medium</option>
                <option>Hard</option>
            </select>
        </div>
    </div>

    <!-- TEST CARDS -->
    <div class="row">

        <!-- Quantitative Test -->
        <div class="col-md-4 mb-4">
            <div class="card p-3 test-card">
                <h5>📐 Quantitative Aptitude Test</h5>
                <p>20 Questions • 20 Minutes</p>

                <div class="progress mb-3">
                    <div class="progress-bar bg-success" style="width: 40%;">40% Completed</div>
                </div>

                <a class="btn btn-primary w-100" href="/startTest?category=quant">Start Test</a>
            </div>
        </div>

        <!-- Logical Test -->
        <div class="col-md-4 mb-4">
            <div class="card p-3 test-card">
                <h5>🧠 Logical Reasoning Test</h5>
                <p>15 Questions • 15 Minutes</p>

                <div class="progress mb-3">
                    <div class="progress-bar bg-warning" style="width: 10%;">10% Completed</div>
                </div>

                <a class="btn btn-primary w-100" href="/startTest?category=logical">Start Test</a>
            </div>
        </div>

        <!-- Verbal Test -->
        <div class="col-md-4 mb-4">
            <div class="card p-3 test-card">
                <h5>📚 Verbal Ability Test</h5>
                <p>25 Questions • 25 Minutes</p>

                <div class="progress mb-3">
                    <div class="progress-bar bg-info" style="width: 60%;">60% Completed</div>
                </div>

                <a class="btn btn-primary w-100" href="/startTest?category=verbal">Start Test</a>
            </div>
        </div>

    </div>

    <!-- MOCK EXAM SECTION -->
    <div class="card p-4 mt-4 test-card">
        <h4>🔥 Full Mock Exam</h4>
        <p>50 Questions • 60 Minutes • Mixed Difficulty</p>
        <a class="btn btn-danger btn-lg w-100" href="/startMock">Start Mock Exam</a>
    </div>

</div>

<!-- FOOTER -->
<div class="footer">
    © 2025 AptitudeApp - All Rights Reserved
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
