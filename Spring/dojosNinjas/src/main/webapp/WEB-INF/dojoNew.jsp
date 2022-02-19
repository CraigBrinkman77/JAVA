<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1>View Dojos and Create Dojo</h1>
	
	<c:forEach items="${dojos }" var="d">
		<li><c:out value="${d.dojoName }"/></li>
	</c:forEach>
	
	
	<form:form class="card p-1 mx-auto col-4" action="/dojos/submit"
		method="post" modelAttribute="dojo">
		<h1>Create a Dojo</h1>
		<div class="form-group">
			<form:label class="form-label" path="dojoName">Dojo Name</form:label>
			<form:errors path="dojoName" />
			<form:input class="form-control " path="dojoName" />
			<button class="btn btn-success mt-1"> Submit</button>
		</div>
		
	</form:form>
</div>
	
</body>
</html>