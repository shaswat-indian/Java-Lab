<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shirt Shopping</title>
</head>
<body>
	<h1>Select Your shirt Preferences</h1>
	<form action="shirt" method="post">
			Select Your Accessories:<br>
			<input type="checkbox" name="accessories" value="belt">Belt<br>
			<input type="checkbox" name="accessories" value="cap">Cap<br>
			<input type="checkbox" name="accessories" value="hairband">Hair Band<br>
			T-shirt Tag line <input type="text" name="tagline"><br>
			Chest Pocket:-<br>
			<input type="radio" name=pocket value=yes checked="checked">Yes<br>
			<input type="radio" name=pocket value=No >No<br>
			Shirt Color:-<br>
			<select name="color">
				<option>Red</option>
				<option>Blue</option>
			</select>
			<input type="submit" value="Submit">
	</form>
</body>
</html>