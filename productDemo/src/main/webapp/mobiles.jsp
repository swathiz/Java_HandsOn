<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${Product_Name}</h2>
Welcome to <%= request.getParameter("pname") %> page

<li>Motorola</li>
<li>iPhone</li>
<br>
<a href="index.jsp">Home Page</a> 
</body>
</html>