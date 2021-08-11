<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/time.css">
<meta charset="UTF-8">
<title>Time</title>
</head>
<body>

	<script src="js/time.js"></script>

		<p><c:out value="${date}"></c:out></p>
		<a href="/">Home</a>
	

</body>
</html>