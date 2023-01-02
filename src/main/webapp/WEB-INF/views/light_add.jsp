<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<%@ include file="./base.jsp"%>
<head>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS v5.2.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">新增燈光設備</h1>
				<form action="handle_light_add" method="POST">
					<div class="form-group">
						<label for="name">設備名稱</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="輸入設備名稱" required="required">
					</div>
					<div class="form-group">
						<label for="quantity">設備數量</label>
						<textarea class="form-control" id="quantity"
							aria-describedby="emailHelp" name="quantity" 
							placeholder="輸入設備數量"
							required="required"></textarea>
					</div>					
					<div class="container text-conter">
						<a href="${pageContext.request.contextPath }/light"
							class="btn btn-outline-danger">返回</a>
						<button type="submit" class="btn btn-outline-success">新增</button>
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