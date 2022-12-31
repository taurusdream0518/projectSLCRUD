<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>

<!-- Required meta tags -->
<meta charset="utf-8">
<%@ include file="./base.jsp"%>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS v5.2.1 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1>音響</h1>
				<br>
				<table class="table table-hover">
					<thead class="thead-dark">
						<tr>
							<th scope="col"></th>
							<th scope="col">名稱</th>
							<th scope="col">數量</th>							
							<th scope="col">更新</th>
							<th scope="col">刪除</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${sounds}" var="s" varStatus="i">
							<tr>
								<!--  <th scope="row">${p.id }</th>-->
								<th>${i.count}</th>
								<td>${s.name }</td>
								<td>${s.quantity}</td>
								<td><a href="update_sound/${s.id}"><i
										class="fasolidfa-file-pen btn btn-outline-primary" style="font-size: 18px">更新</i></a></td>
								<td><a href="delete_sound/${s.id}"><i
										class="fasolidfa-trash-can btn btn-outline-danger" style="font-size: 18px">刪除</i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container">
					<a href="add_sound" class="btn btn-outline-primary"> Add Product</a>
				</div>
			</div>
		</div>
	</div>






	<!-- Bootstrap JavaScript Libraries -->
	<script	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js">
	</script>

	<script	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js">
	</script>
</body>

</html>