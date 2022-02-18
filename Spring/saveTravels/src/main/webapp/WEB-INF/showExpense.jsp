<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
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
	<div class="d-flex justify-content-around m-2">
		<h1>Expense Details</h1>
		<a href="/expenses">Go Back</a>
	</div>
	<div class="card mx-auto col-3">
		<p>Name: <c:out value="${expense.getExpenseName() }"/></p>
		<p>Description: <c:out value="${expense.getDescription() }"/></p>
		<p>price: $<c:out value="${expense.getAmount() }"/></p>
		<p>Vendor: <c:out value="${expense.getVendor() }"/></p>
	</div>
</body>
</html>