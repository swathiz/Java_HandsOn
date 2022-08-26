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
				<h1>Fill the User details</h1>
				
				<form action="handle-product" method="post">
					
					<!-- <div class="form-group">-->
						<label for="name">User Name</label> 
						<input type="text"
							 id="name" 
							name="name" >
<br>
				<!-- 	</div>-->
				<!-- 	
					<div class="form-group">-->

						<label for="description">User Address</label>
						<input  type ="text" name="description" id="description">
					<!-- </div>-->

					<br>
					<!-- <div class="form-group">-->
						<label for="price">User Bill</label>
						 <input type="text" name="price" id="price">
					<!-- </div>-->
<br>
					
					<!-- <div class="container text-center">-->
						<a href="${pageContext.request.contextPath}/" class="btn">Back</a>
						<button type="submit" class="btn ">Add</button>

					<!-- </div>-->





				</form>

		<!-- 	</div>
		</div>
	</div>-->

</body>
</html>