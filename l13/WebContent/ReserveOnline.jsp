<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Booking Details</h1>
	<form action="ViewDetails.jsp" method=POST>
		Flight No.: <input type=text name=flightNo ><br>
		Date: <input type=text name=date ><br>
		Customer Name: <input type=text name=cname><br>
		Phone No.: <input type=text name=phno ><br>
		<input type=submit value=Submit>
	</form>
	<a href="getFlights.html">View Flights</a><br>

</body>
</html>