<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">

	<h2>Omikuji Form</h2>
   <form action='/submit' method='post'>
    
    <div>
    	<label>Choose a number from 5-25:</label><br/>
    	<input type="number" name='number' min=5 max=25 placeholder=5-25>
    </div>
    
    <div>
    	<label>City:</label>
    	<input type="text" name='city'>
    </div>
    
	<div>
    	<label>Name:</label>
    	<input type="text" name='name'>
    </div>
    
   <div>
    	<label>Living thing:</label>
    	<input type="text" name='livingthing'>
    </div>
    
	<div>
    	<label>Hobby:</label>
    	<input type="text" name='hobby'>
    </div>
    
    <div>
    	<label>Message:</label>
    	<textarea name='nicemessage'> </textarea>
    </div>
    
    	<input type='submit' value='Submit'>
    </form>
</div>
</body>
</html>