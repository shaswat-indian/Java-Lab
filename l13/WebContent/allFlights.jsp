<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String date=request.getParameter("wday");
		if(date==null||date.equals("")){
			date="";
			out.println("No Date specified! Displaying all Flights.");
		}
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flight_Bookings","root","msrit");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Flight where weekdays like '%"+date+"%';");
		if(rs.next()==false){
			out.println("No Flight Exists on this Day!");
		}
		else{
			rs.previous();
			out.println("<table border=1px>");
			out.println("<tr><th>Flight No.</th><th>Airlines</th><th>Weekdays</th></tr>");
			while(rs.next()){
				out.println("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
			}
			out.println("</table>");
		}
	%>
</body>
</html>