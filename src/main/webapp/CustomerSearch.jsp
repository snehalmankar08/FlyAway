<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search for Airline</title>
</head>
<body>

<jsp:include page="Header.jsp">
		<jsp:param value="Flight Booking" name="header"/>
	</jsp:include>



<h1>Enter the below travel details to search a Airline</h1>

<form action="flyawaycustomer" method="get" >
From  :<select class="form-control"
			id="from" name="from">
			<option value="Mumbai">Mumbai</option>
			<option value="Kolkata">Kolkata</option>
			<option value="Delhi">Delhi</option>
			<option value="Bangalore">Bangalore</option>
			<option value="Hyderabad">Hyderabad</option>
		</select>
							<br><br>
To    :<select class="form-control"
			id="to" name="to">
			<option value="Mumbai">Mumbai</option>
			<option value="Kolkata">Kolkata</option>
			<option value="Delhi">Delhi</option>
			<option value="Bangalore">Bangalore</option>
			<option value="Hyderabad">Hyderabad</option>
		</select>
		<br><br>
Departure date:<input type="date" name="date"><br><br>
No of Persons:<input type="number" name="persons">
<tr>
			<td colspan="2" align="center"> 
				<input type="submit" value="Search">
			</td>
		</tr>
	</form>
	

</body>
</html>