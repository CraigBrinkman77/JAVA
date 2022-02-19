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
	<form:form class="card p-1 mx-auto col-4" action="/ninja/submit"
		method="post" modelAttribute="ninja">
		<h1>Create a Ninja</h1>
		<div class="form-group">
			<form:label class="form-label" path="firstName">First Name</form:label>
			<form:errors path="firstName" />
			<form:input class="form-control " path="firstName" />

		</div>
		<div class="form-group">
			<form:label class="form-label" path="lastName">Last Name</form:label>
			<form:errors path="lastName" />
			<form:input class="form-control " path="lastName" />

		</div>
		<div class="form-group">
			<form:label class="form-label" path="age">Age</form:label>
			<form:errors path="age" />
			<form:input type="number" min="1" increment="1" class="form-control"
				path="age" />
		</div>
		<div class="form-group">
			<form:select path="dojo">
				<c:forEach items="${dojos}" var="d">
					<form:option value="${d.id }">
						<c:out value="${d.dojoName }" />
					</form:option>
				</c:forEach>
			</form:select>
		</div>

		<button class="btn btn-success mt-1">Submit</button>
	</form:form>
</body>
</html>