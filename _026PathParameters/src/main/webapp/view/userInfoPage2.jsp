<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Info 2</title>

<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background: #f7f9fc;
        font-family: 'Segoe UI', sans-serif;
    }

    .card-custom {
        margin-top: 60px;
        padding: 30px;
        border-radius: 15px;
        box-shadow: 0px 6px 15px rgba(0,0,0,0.1);
        background: white;
    }
</style>
</head>
<body>

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">AptitudeApp</a>
  </div>
</nav>

<div class="container">
    <div class="card card-custom">
        <h2 class="text-primary mb-4">Course Enrollment</h2>

        <p class="fs-4">
            🎓 <strong>${name}</strong> has enrolled in the 
            <span class="text-success"><strong>${course}</strong></span> course.
        </p>

        <a href="/greetingsapp/home" class="btn btn-primary mt-4">Go Back Home</a>
    </div>
</div>

</body>
</html>
