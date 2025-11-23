<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aptitude Preparation Books</title>

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
        border-radius: 10px;
        margin-top: 30px;
    }
    .book-card {
        transition: 0.3s;
        border-radius: 10px;
    }
    .book-card:hover {
        transform: translateY(-5px);
        box-shadow: 0px 6px 16px rgba(0,0,0,0.15);
    }
    .footer {
        background: #111;
        color: #aaa;
        padding: 20px;
        margin-top: 40px;
        text-align: center;
    }
</style>

</head>
<body>

<!-- NAV -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">AptitudeApp</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ms-auto">
        <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Tests</a></li>
        <li class="nav-item"><a class="nav-link active" href="#">Books</a></li>
        <li class="nav-item"><a class="nav-link" href="#">Login</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- HERO -->
<div class="container">
    <div class="hero">
        <h1 class="display-5"><span style="font-size: 40px;">📚</span> Aptitude Preparation Books</h1>
        <p class="lead">Browse through available aptitude practice books.</p>
    </div>

    <!-- BOOKS LIST -->
    <div class="row mt-5">

        <c:forEach var="bk" items="${listOfBooks}">
            <div class="col-md-4 mb-4">
                <div class="card p-3 book-card">
                    <h5>📗 ${bk}</h5>
                    <p>A useful book to practice aptitude problems.</p>
                    <button class="btn btn-primary">Read More</button>
                </div>
            </div>
        </c:forEach>

    </div>
</div>

<!-- FOOTER -->
<div class="footer">
    © 2025 AptitudeApp - All Rights Reserved
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
