package com.manjeet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/filtertest")
public class filerDemo  extends HttpServlet{

	
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String string =req.getParameter("sname");
		
		int id =    Integer.parseInt( req.getParameter("sid"));
		
		PrintWriter obj = resp.getWriter();
		obj.print("id: "+id+" || name : "+string);
		
		
	}
}
