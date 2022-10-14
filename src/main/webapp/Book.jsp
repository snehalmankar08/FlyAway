<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="Header.jsp">
		<jsp:param value="Flight Booking Register Page" name="header"/>
	</jsp:include>
<h1 class="text-center">Flight Details</h1>
<br><br>

<div class="container">
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Flight</th>
				<th scope="col">Source</th>
				<th scope="col">Destination</th>
				<th scope="col">Date</th>
				<th scope="col">Ticket Price</th>
				<th scope="col">Select</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>1</th>
				<th>GoAir U7-798</th>
				<th>Delhi</th>
				<th>Hyderabad</th>
				<th>15-Oct-2022</th>
				<th>5000</th>
				<th>1</th>
			</tr>
			<tr>
				<th>2</th>
				<th>Air India K0-873</th>
				<th>Delhi</th>
				<th>Hyderabad</th>
				<th>15-Oct-2022</th>
				<th>4000</th>
				<th>2</th>
			</tr>
			<tr>
				<th>3</th>
				<th>Vistara K0-873</th>
				<th>Delhi</th>
				<th>Hyderabad</th>
				<th>15-Oct-2022</th>
				<th>8000</th>
				<th>3</th>
			</tr>
		</tbody>
	</table>
</div>

</body>
</html>