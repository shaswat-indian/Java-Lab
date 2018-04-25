package jj8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.parser.Scanner;

public class TaxProcess extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name;
		int age;
		float basic,taxp,net,taxamt;
		name=req.getParameter("pname");
		age=Integer.parseInt(req.getParameter("age"));
		basic=Float.parseFloat(req.getParameter("salary"));
		taxp=Float.parseFloat(req.getParameter("tax"));
		taxamt=(taxp/100)*basic;
		net=basic-taxamt;
		
		File f=new File("TaxFile.txt");
		PrintWriter pw=new PrintWriter(f);
		pw.println("Name:"+name+"\nAge:"+age+"\nBasic Salary: Rs."+basic+"\nTax Deducted: Rs."+taxamt+"\nNet Salary: Rs."+net);
		pw.close();
		
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>"
				+ "<head><title>Tax Calculated</title></head>"
				+ "<body>"
				+ "<h1>Tax Information</h1>"
				+ "<p>Name:"+name+"</p><br>"
				+ "<p>Age:"+age+"</p><br>"
				+ "<p>Basic Salary: Rs."+basic+"</p><br>"
				+ "<p>Tax Deducted: Rs."+taxamt+"</p><br>"
				+ "<p>Net Salary: Rs."+net+"</p><br>"
				+ "</body></html>");
		out.close();
		
		java.util.Scanner in=new java.util.Scanner(f);
		while(in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		in.close();
		
	}


}
