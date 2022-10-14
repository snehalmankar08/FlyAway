<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>

<h1 align='center' >Admin page</h1>
<table align="center" WIDTH='50%' CELLSPACING='2' CELLPADDING='4'>
<tr><td><a href="cpassword.jsp">Change password</a></td>

<td><form action="places" method="get">
<input type="submit" value="Master list of places">
</form></td>

<td><form action="airlines" method="get">
<input type="submit" value="Master list of airlines">
</form></td>


<td><form action="flightdetails" method="get">
<input type="submit" value="Master list of flights">
</form></td></tr></table>

</body>
</html>