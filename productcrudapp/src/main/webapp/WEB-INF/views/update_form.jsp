 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<!-- <div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">-->
				<h1>Edit the user details</h1>
				
				<form action="${pageContext.request.contextPath }/handle-product" method="post">
				<label for="name">User Id</label>
				<input type="text" value="${product.id}" name="id"/>
					<br>
					<!-- <div class="form-group">-->
						<label for="name">User Name</label> 
						<input type="text" id="name" name="name" value="${product.name }">
<br>
					<!-- </div>-->
					
					<!-- <div class="form-group">
-->
						<label for="description">User Address</label>
						<input 
						name="description" 
						id="description" value="${product.description}">
						
						<!-- 
					</div>

				
					<div class="form-group">--><br>
						<label for="price">User Bill</label> 
						<input type="text"
							 name="price"
							id="price" value="${product.price}">
					<!-- </div>-->

					
					<!-- <div class="container text-center">-->
					<br>
						<a href="${pageContext.request.contextPath}/" >Back</a>
						<button type="submit" >Update</button>

					<!-- </div>-->
				</form>
<!-- 
			</div>
		</div>
	</div>
-->
</body>
</html>