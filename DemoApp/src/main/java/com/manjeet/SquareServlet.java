package com.manjeet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest request , HttpServletResponse resp) throws ServletException, IOException {
		
//		int k = (int)request.getAttribute("k_is");              // valid when we use RequestDispatcher
//		
//		int k = Integer.parseInt(request.getParameter("k"));     //Value of k from URL rewriting
		
		
//		HttpSession session = request.getSession();               //fetching from Session
//		int k = (int) session.getAttribute("k");  
		
		int k=0;
		javax.servlet.http.Cookie[] cookies= request.getCookies();
		
		for(javax.servlet.http.Cookie c: cookies) {
			
			if(c.getName().equals("k")) {
				 k = Integer.parseInt(c.getValue());
				
			}
			
		}
		
		
		
		PrintWriter pr = resp.getWriter();
		pr.print("Square of sum is : "+k*k);
		
		
//		
		
	}

}
