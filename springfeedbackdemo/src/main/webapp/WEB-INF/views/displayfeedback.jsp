<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Users</title>
</head>
<body>

	<c:forEach var="feedback" items="${feedbacks}">
		<li>${feedback}</li> 
	</c:forEach>
	
	<a href="feedback">Home page</a>

</body>
</html>	