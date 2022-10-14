<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body bgcolor="lightblue">

<jsp:include page="Header.jsp">
		<jsp:param value="Flight Booking" name="header"/>
	</jsp:include>

<h1>Welcome to FlyAway Portal</h1>
<table style="align: center; width: 50%; cell-spacing:2; cell-padding:4"">
<tr><td><a href="CustomerSearch.jsp">
<input type="Submit" value="Search for a flight">
</a></td>
<td><a href="AdminLogin.jsp">
<input type="Submit" value="Admin Login">
</a></td></tr></table>


</body>
</html>