<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String fltNo=request.getParameter("flightNo");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flight_Bookings","root","msrit");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Flight where flight_number="+fltNo+";");
		if(rs.next()==false){
			out.println("Flight Does not Exists!");
		}
		else{
			String date=request.getParameter("date");
			String cname=request.getParameter("cname");
			String phno=request.getParameter("phno");
			
			int seatno=(int)(Math.random()*500);
			
			stmt.executeUpdate("insert into SeatReservation values("+fltNo+",'"+date+"',"+seatno+",'"+cname+"','"+phno+"');");
			out.println("Booking Successfull!<br>");
			out.println("Flight No.:"+fltNo+"<br>");
			out.println("Date:"+date+"<br>");
			out.println("Seat No.:"+seatno+"<br>");
			out.println("Customer Name:"+cname+"<br>");
			out.println("Phone No.:"+phno+"<br>");
		}
	%>
	<a href="getFlights.html">View Flights</a><br>
</body>
</html>