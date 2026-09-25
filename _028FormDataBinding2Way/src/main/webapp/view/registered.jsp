<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Successful - AptitudeApp</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
    body {
        background: #f7f9fc;
        font-family: 'Segoe UI', sans-serif;
    }

    .profile-container {
        max-width: 650px;
        margin: 60px auto;
    }

    .profile-card {
        border: none;
        border-radius: 12px;
        box-shadow: 0px 8px 25px rgba(0,0,0,0.1);
        overflow: hidden;
    }

    .success-header {
        background: linear-gradient(135deg, #198754, #20c997);
        color: white;
        text-align: center;
        padding: 30px;
    }

    .profile-icon {
        font-size: 60px;
        margin-bottom: 10px;
    }

    .profile-info {
        padding: 30px;
    }

    .info-row {
        display: flex;
        justify-content: space-between;
        padding: 15px 5px;
        border-bottom: 1px solid #eee;
    }

    .info-label {
        font-weight: 600;
        color: #555;
    }

    .info-value {
        color: #222;
    }

    .footer {
        background: #111;
        color: #aaa;
        padding: 20px;
        text-align: center;
        margin-top: 80px;
    }
</style>

</head>

<body>

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">

        <a class="navbar-brand" href="/home">
            AptitudeApp
        </a>

        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">

                <li class="nav-item">
                    <a class="nav-link" href="/home">
                        Home
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/tests">
                        Tests
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active" href="/register">
                        Register
                    </a>
                </li>

            </ul>
        </div>

    </div>
</nav>


<!-- PROFILE -->
<div class="container profile-container">

    <div class="card profile-card">

        <!-- SUCCESS HEADER -->
        <div class="success-header">

            <div class="profile-icon">
                👤
            </div>

            <h2>Registration Successful!</h2>

            <p class="mb-0">
                Welcome to AptitudeApp, ${student.name}
            </p>

        </div>


        <!-- STUDENT INFORMATION -->
        <div class="profile-info">

            <h4 class="mb-4">
                Student Profile
            </h4>


            <div class="info-row">

                <span class="info-label">
                    Student ID
                </span>

                <span class="info-value">
                    ${student.sid}
                </span>

            </div>


            <div class="info-row">

                <span class="info-label">
                    Name
                </span>

                <span class="info-value">
                    ${student.name}
                </span>

            </div>


            <div class="info-row">

                <span class="info-label">
                    Age
                </span>

                <span class="info-value">
                    ${student.age}
                </span>

            </div>


            <!-- BUTTONS -->
            <div class="d-flex gap-2 mt-4">

                <a href="/tests"
                   class="btn btn-primary flex-grow-1">
                    Start Practicing
                </a>

                <a href="/home"
                   class="btn btn-outline-secondary flex-grow-1">
                    Back to Home
                </a>

            </div>

        </div>

    </div>

</div>


<!-- FOOTER -->
<div class="footer">
    © 2025 AptitudeApp - All Rights Reserved
</div>

</body>
</html>