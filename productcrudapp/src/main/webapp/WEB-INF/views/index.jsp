<html>

<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>

	<!-- <div class="container mt-3">
		<div classs="row">
			<div class="col-md-12">-->

				<h1>Welcome to User page</h1>

				<table class="table">
					<!-- <thead class="thead-dark">-->
						<tr>
							<th scope="col">Id</th>
							<th scope="col">User Name</th>
							<th scope="col">Address</th>
							<th scope="col">bill</th>
							<th scope="col">Action</th>
						</tr>
					<!-- </thead>
					<tbody>-->
						<c:forEach items="${products}" var="p">
						<tr>
								<th scope="row">${p.id }</th>
								<td>${p.name }</td>
								<td>${p.description }</td>
								<td>${p.price}</td>
								<td>
									<a href="delete/${p.id}">
									<!-- <i class="fas fa-trash text-danger" style="font-size: 25px;"></i>-->
									delete
									</a>
									/
									<a href="update/${p.id}">
									<!-- <i class="fas fa-marker" style="font-size: 25px"></i>-->
									edit
									</a>			
								</td>
							</tr>
						</c:forEach>
					<!-- </tbody>-->
				</table>
			<!-- 	<div class="container text-center">-->
					<a href="add-product" class="btn">Add
						User</a>
				<!-- </div>
			</div>
		</div>
	</div>-->
</body>
</html>
