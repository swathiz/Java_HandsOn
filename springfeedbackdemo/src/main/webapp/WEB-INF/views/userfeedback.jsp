<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<Center><h2>User FeedBack Form</h2></Center>

<form action="addfeedback" method="post">
		<pre>
		username: <input type="text" name="username" />
		Comments: <input type="text" name="comments" />
		rating: <input type="text" name="rating" />
		<input type="submit" name="Feedback" />
		</pre>
</form>
<p>${feedback.username}</p>
<p><%= request.getAttribute("result") %></p>
<a href="allfeedbacks">view user feedbacks</a>

</body>
</html>