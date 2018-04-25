package jj10;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;
import java.sql.Statement;

public class SearchDatabase extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Statement stmt = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineDirectory", "root", "msrit");
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ip;
		int num;
		ResultSet rs = null;
		String type=req.getParameter("iptype");
		//System.out.println(type);
		if(type.equals("Name")) {
			ip=req.getParameter("inp");
			try {
				rs=stmt.executeQuery("select * from Telephone_Directory where Name='"+ip+"';");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(type.equals("PhoneNo"))	{
			num=Integer.parseInt(req.getParameter("inp"));
			try {
				rs=stmt.executeQuery("select * from Telephone_Directory where Phone_Number="+num+";");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("<html>"
				+ "<head><title>Search Results</title><head>"
				+ "<body>");
		
		try {
			
		if(rs.next()!=false) {
		
			rs.previous();

				while(rs.next()) {
				/*
				System.out.println("Phone No.: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Address: "+rs.getString(3));
				System.out.println("Company: "+rs.getString(4));
				System.out.println("Pincode: "+rs.getInt(5));		
				*/
					pw.println("<h2>Details:-</h2>");
					pw.println("<p>Phone No.: "+rs.getInt(1)+"</p><br>");
					pw.println("<p>Name: "+rs.getString(2)+"</p><br>");
					pw.println("<p>Address: "+rs.getString(3)+"</p><br>");
					pw.println("<p>Company: "+rs.getString(4)+"</p><br>");
					pw.println("<p>Pincode: "+rs.getInt(5)+"</p><br>");

				}
		}
		else
			//System.out.println("No Such Data Found!");
			pw.println("<p> No Such Data Found!</p><br>");

			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
		}	
	
		pw.println("<a href=search.jsp>Search Again</a><br>");
		pw.println("<a href=insert.html>Insert New Data</a><br>");
		pw.println("</body></html>");
		pw.close();

			
		
	}

}
