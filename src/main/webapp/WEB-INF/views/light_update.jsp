<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS v5.2.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<%@ include file="./base.jsp"%>
</head>

<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Fill the Product detail</h1>
				<form action="${pageContext.request.contextPath}/handle_light_update"
					method="POST">
					<div class="form-group">
						<input type="hidden" value="${light.id}" name="id">
					</div>
					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter the product name here" required="required"
							value="${light.name}">
					</div>
					
					<div class="form-group">
						<label for="quantity">Product Quantity</label> <input
							class="form-control" id="quantity" ariadescribedby="emailHelp"
							name="quantity" placeholder="Enter the product Quantity here"
							required="required" value="${light.quantity}" />
					</div>
					<div class="container text-conter">
						<a href="${pageContext.request.contextPath }/light"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-outline-success">update</button>
					</div>
				</form>
			</div>
		</div>
	</div>




	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js">
		
	</script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js">
		
	</script>
</body>

</html>