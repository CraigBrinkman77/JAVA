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
	<h1>View your expenses</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ expenses}" var="exp">
				<tr>
					<td><a href="/expenses/${exp.id}"><c:out value="${exp.getExpenseName() }" /></a></td>
					<td><c:out value="${exp.getVendor() }" /></td>
					<td><c:out value="${exp.getAmount()}" /></td>
					<%-- ${String.format('%.2f', exp.amount } --%>
					<td class="d-flex align-items-center">
					<a class= "btn btn-success" href="/expenses/edit/${exp.id}"> Edit</a>
					<form action="/expense/delete/${exp.id}" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <input class = "btn btn-danger" type="submit" value="Delete">
					</form>
					</td>


				</tr>
			</c:forEach>
		</tbody>
	</table>

	<hr />
	<form:form class="card p-1 mx-auto col-2" action="/expenses/submit"
		method="post" modelAttribute="expense">
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
			<form:input type="double" class="form-control" path="amount" />
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