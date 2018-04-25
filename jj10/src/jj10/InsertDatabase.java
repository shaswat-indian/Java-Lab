package jj10;


import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertDatabase extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int phno=Integer.parseInt(req.getParameter("phno"));
		String name=req.getParameter("pname");
		String addr=req.getParameter("addr");
		String comp=req.getParameter("comp");
		int pc=Integer.parseInt(req.getParameter("pin"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineDirectory","root", "msrit");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into Telephone_Directory values("+phno+",'"+name+"','"+addr+"','"+comp+"',"+pc+");");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>"
				+ "<head><title>Message</title></head>"
				+ "<body>"
				+ "<h2>Data Inserted Successfully</h2>"
				+ "<a href=\"insert.html\">Insert More Data</a><br>"
				+ "<a href=\"search.jsp\">Search Directory</a><br>"
				+ "</body>"
				+ "</html>");
		out.close();
	}
}
