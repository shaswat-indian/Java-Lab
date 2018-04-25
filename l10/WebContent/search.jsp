<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Directory</title>
</head>
<body>
	<form action="search" method="post">
		<h1>Enter Details to be Searched</h1>
		Enter Name/Phone No.: <input type=text name=inp required><br>
		<input type="radio" name="iptype" value="Name" checked>By name</input><br>	
		<input type="radio" name="iptype" value="PhoneNo">By Phone No</input><br>
		<input type="submit" name="search" value="Search">
	</form><br>
	<a href="insert.html">Insert New Data</a>
</body>
</html>