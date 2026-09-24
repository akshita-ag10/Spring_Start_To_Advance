<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration - AptitudeApp</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
    body {
        background: #f7f9fc;
        font-family: 'Segoe UI', sans-serif;
    }

    .register-container {
        max-width: 600px;
        margin: 60px auto;
    }

    .register-card {
        border: none;
        border-radius: 12px;
        box-shadow: 0px 8px 25px rgba(0,0,0,0.1);
    }

    .card-header {
        background: linear-gradient(135deg, #007bff, #4A90E2);
        color: white;
        text-align: center;
        padding: 25px;
        border-radius: 12px 12px 0 0 !important;
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
        <a class="navbar-brand" href="/home">AptitudeApp</a>

        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/tests">Tests</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/register">Register</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


<!-- REGISTRATION FORM -->
<div class="container register-container">

    <div class="card register-card">

        <div class="card-header">
            <h2>Student Registration</h2>
            <p class="mb-0">Create your AptitudeApp profile</p>
        </div>

        <div class="card-body p-4">

            <form action="/formbinding/register" method="post">

                <!-- Student ID -->
                <div class="mb-3">
                    <label for="sid" class="form-label">
                        Student ID
                    </label>

                    <input type="number"
                           class="form-control"
                           id="sid"
                           name="sid"
                           placeholder="Enter your student ID"
                           required>
                </div>


                <!-- Name -->
                <div class="mb-3">
                    <label for="name" class="form-label">
                        Name
                    </label>

                    <input type="text"
                           class="form-control"
                           id="name"
                           name="name"
                           placeholder="Enter your name"
                           required>
                </div>


                <!-- Age -->
                <div class="mb-4">
                    <label for="age" class="form-label">
                        Age
                    </label>

                    <input type="number"
                           class="form-control"
                           id="age"
                           name="age"
                           placeholder="Enter your age"
                           min="1"
                           max="100"
                           required>
                </div>


                <!-- Submit -->
                <button type="submit"
                        class="btn btn-primary w-100">
                    Register
                </button>

            </form>

        </div>
    </div>

</div>


<!-- FOOTER -->
<div class="footer">
    © 2025 AptitudeApp - All Rights Reserved
</div>

</body>
</html>