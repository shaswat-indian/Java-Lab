<%@page import="java.util.HashMap"%>
<%@page import="java.util.*" %>
<%@page import="java.util.Map.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main Page</title>
</head>
<body>
	<%! HashMap<String,String> hm= new HashMap<String,String>();
		String user="";
		String pass="";
		Date date=null;
		Boolean flag=false;
	%>
		
	<% 	hm.put("modi", "bjp");
		hm.put("raga", "congress");
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		
		if(!(hm.containsKey(user))){
			out.print("<h1>No Such User</h1>");
			out.print("<a href=login.html>Click here to Try Again</a>");
		}
		else if(!hm.get(user).equals(pass)){
			out.print("<h1>Wrong Password!</h1>");
			out.print("<a href=login.html>Click here to Try Again</a>");
		}
		else{
			out.print("<h1>Welcome "+user+"</h1>");
			date=new Date();			
			out.print("<h2>Today's Date: "+date+"</h2>");
			out.print("<form method=post action=CalculateTax.jsp>Name: <input type=text name=uname><br>"+
					"Place of Work: <select name=pow>"+
				"<option value=iit>IIT</option>"+
			"<option value=msrit>MSRIT</option>"+
				"</select><br>"+
				"Gender: <input type=radio name=gender value=male checked>Male<input type=radio name=gender value=female>Female"+
					"<br>Annual Income: <input type=text name=income><br>"+
					"<input type=submit name=submit"+
						"</form>");
		}
		
		%>
		
	
	
		
	
	 
	

</body>
</html>