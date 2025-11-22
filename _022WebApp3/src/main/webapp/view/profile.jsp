<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile | AptitudeApp</title>

<!-- Bootstrap 5 CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background: #f7f9fc;
        font-family: 'Segoe UI', sans-serif;
    }

    .header-banner {
        background: linear-gradient(135deg, #4A90E2, #007bff);
        color: white;
        padding: 50px 20px;
        border-radius: 8px;
        margin-top: 30px;
        text-align: center;
    }

    .profile-card {
        border-radius: 8px;
        background: white;
        padding: 25px;
        box-shadow: 0px 4px 12px rgba(0,0,0,0.1);
    }

    .info-label {
        font-weight: 600;
        color: #333;
    }

    .footer {
        background: #111;
        color: #aaa;
        padding: 20px;
        text-align: center;
        margin-top: 40px;
    }

    .edit-btn:hover {
        transform: translateY(-2px);
        box-shadow: 0px 6px 14px rgba(0,0,0,0.12);
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
        <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Tests</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Results</a></li>
        <li class="nav-item"><a class="nav-link active" href="#">Profile</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- PROFILE HEADER -->
<div class="container">
    <div class="header-banner">
        <h1 class="display-5">${greet}</h1>
        <p class="lead">Manage your personal information and track your progress.</p>
    </div>

    <!-- PROFILE DETAILS -->
    <div class="row justify-content-center mt-5">
        <div class="col-md-8">
            <div class="profile-card">

                <h4 class="mb-4">👤 Your Profile</h4>

                <div class="row mb-3">
                    <div class="col-sm-4 info-label">Username:</div>
                    <div class="col-sm-8">${username}</div>
                </div>

                <div class="row mb-3">
                    <div class="col-sm-4 info-label">Email:</div>
                    <div class="col-sm-8">${email}</div>
                </div>

                <div class="row mb-3">
                    <div class="col-sm-4 info-label">Member Since:</div>
                    <div class="col-sm-8">${memberSince}</div>
                </div>

                <div class="row mb-4">
                    <div class="col-sm-4 info-label">Completed Tests:</div>
                    <div class="col-sm-8">${completedTests}</div>
                </div>

                <div class="text-center">
                    <a href="#" class="btn btn-primary btn-lg edit-btn">Edit Profile</a>
                </div>
            </div>
        </div>
    </div>

    <!-- QUICK STATS SECTION -->
    <div class="row mt-5">
        <div class="col-md-4 mb-4">
            <div class="card p-3 feature-card">
                <h5>📊 Accuracy</h5>
                <p>${accuracy}% overall accuracy across all tests.</p>
            </div>
        </div>

        <div class="col-md-4 mb-4">
            <div class="card p-3 feature-card">
                <h5>🔥 Best Score</h5>
                <p>Your highest score: <strong>${bestScore}</strong></p>
            </div>
        </div>

        <div class="col-md-4 mb-4">
            <div class="card p-3 feature-card">
                <h5>📅 Last Test</h5>
                <p>Last attempted on: ${lastTestDate}</p>
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
