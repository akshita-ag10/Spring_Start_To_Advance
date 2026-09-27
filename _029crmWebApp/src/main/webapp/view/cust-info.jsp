<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Customer Information</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
body {
	background: #f7f9fc;
	font-family: 'Segoe UI', sans-serif;
}

.customer-container {
	max-width: 1000px;
	margin: 60px auto;
}

.customer-card {
	border: none;
	border-radius: 12px;
	box-shadow: 0px 8px 25px rgba(0, 0, 0, 0.1);
}

.card-header {
	background: linear-gradient(135deg, #007bff, #4A90E2);
	color: white;
	text-align: center;
	padding: 25px;
	border-radius: 12px 12px 0 0 !important;
}

.table {
	margin-bottom: 0;
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

			<a class="navbar-brand"
				href="${pageContext.request.contextPath}/home"> AptitudeApp </a>

		</div>

	</nav>


	<!-- CUSTOMER INFORMATION -->

	<div class="container customer-container">

		<div class="card customer-card">

			<div class="card-header">
				<h2>Customer Information</h2>
				<p class="mb-0">All registered customers</p>
			</div>


			<div class="card-body p-4">

				<table class="table table-bordered table-hover align-middle">

					<thead class="table-dark">

						<tr>
							<th>Customer ID</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>City</th>
							<th>Actions</th>
						</tr>

					</thead>


					<tbody>

						<c:forEach var="customer" items="${customers}">

							<tr>

								<td>${customer.cid}</td>

								<td>${customer.fname}</td>

								<td>${customer.lname}</td>

								<td>${customer.city}</td>

								<td>
									<!-- UPDATE --> <a
									href="${pageContext.request.contextPath}/customers/update/${customer.cid}"
									class="btn btn-primary btn-sm"> Update </a>
									 <!-- DELETE --> <a
									href="${pageContext.request.contextPath}/customers/delete/${customer.cid}"
									class="btn btn-danger btn-sm"
									onclick="return confirm('Are you sure you want to delete this customer?');">
										Delete </a>

								</td>

							</tr>

						</c:forEach>


						<!-- If there are no customers -->

						<c:if test="${empty customers}">

							<tr>
								<td colspan="5" class="text-center">No customers found.</td>
							</tr>

						</c:if>

					</tbody>

				</table>

				
				<!-- REGISTER NEW CUSTOMER -->
				<div class="text-center mt-4">
					<a href="${pageContext.request.contextPath}/customers/add"
						class="btn btn-success"> Register New Customer </a>
				</div>
				


			</div>

		</div>

	</div>


	<!-- FOOTER -->

	<div class="footer">© 2025 AptitudeApp - All Rights Reserved</div>


</body>
</html>