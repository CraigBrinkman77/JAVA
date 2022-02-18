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
		<h1>Edit Expense</h1>
		<a href="/expenses">Go Back</a>
	</div>
	
	<form:form class="card p-1 mx-auto col-2" action="/expenses/edit/${expense.id}" method="post" modelAttribute="expense">
	<input type="hidden" name="_method" value="put">
		<div class="form-group">
			<form:label class="form-label" path="expenseName">Expense Name</form:label>
			<form:errors path="expenseName" />
			<form:input class="form-control " path="expenseName" />
		</div>
		<div class="form-group ">
			<form:label class="form-label" path="vendor">Vendor</form:label>
			<form:errors path="vendor" />
			<form:input class="form-control " path="vendor" />
		</div>
		<div class="form-group">
			<form:label class="form-label" path="amount">Price $</form:label>
			<form:errors path="amount" />
			<form:input type="double" class="form-control"
				path="amount" />
		</div>
		<div class="form-group ">
			<form:label class="form-label" path="description">Description</form:label>
			<form:errors path="description" />
			<form:textarea class=" form-control" path="description" />
		</div>
		<div class="col-2">
			<button class="btn btn-primary">Submit</button>
		</div>
	</form:form>
</body>
</html>