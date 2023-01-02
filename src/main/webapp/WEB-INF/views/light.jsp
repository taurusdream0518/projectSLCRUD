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

<style type="text/css">
	.c1{width: 20px;}
	.c2{width: 500px;}
	.c3{width: 50px;}
	.c4{width: 50px;}
	.c5{width: 50px;}
</style>

<body>
<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1>燈光</h1>
				<br>
				<table class="table table-hover">
					<thead class="thead-dark">
						<tr>
							<th class="c1" scope="col"></th>
							<th class="c2" scope="col">名稱</th>
							<th class="c3" style="text-align: center"; scope="col">數量</th>							
							<th class="c4" style="text-align: center"; scope="col">更新</th>
							<th class="c5" style="text-align: center"; scope="col">刪除</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${lights}" var="l" varStatus="i">
							<tr>
								<!--  <th scope="row">${p.id }</th>-->
								<th style="text-align: center">${i.count}</th>
								<td>${l.name }</td>
								<td style="text-align: center">${l.quantity}</td>
								<td style="text-align: center"><a href="update_light/${l.id}"><i
										class="fasolidfa-file-pen btn btn-outline-primary" style="font-size: 18px">更新</i></a></td>
								<td style="text-align: center"><a href="delete_light/${l.id}"><i
										class="fasolidfa-trash-can btn btn-outline-danger" style="font-size: 18px">刪除</i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container">
					<a href="add_light" class="btn btn-outline-primary">新增設備</a>
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