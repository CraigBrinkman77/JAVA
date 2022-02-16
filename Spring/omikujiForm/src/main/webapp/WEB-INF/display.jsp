<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container bg-danger">
		<h1>Here's Your Omikuji!</h1>
		<div>
			<p>
				In
				<c:out value="${number}" />
				years, you will live in
				<c:out value="${city}" />
				with
				<c:out value="${name}" />
				as your room-mate,
				<c:out value="${hobby}" />
				for a living.The next time you see a
				<c:out value="${livingthing}" />
				, you will have good luck. Also,
				<c:out value="${nicemessage}" />
				.
			</p>
		</div>
		<div>
			<a href="/showform">Go Back</a>
		</div>
	</div>
</body>
</html>