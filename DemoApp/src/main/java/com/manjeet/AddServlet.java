package com.manjeet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.PriorityQueue;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends  HttpServlet
 {
	

	public void doGet(HttpServletRequest req  , HttpServletResponse res ) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1")) ;
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k =i+j;
		
		

//	    res.getWriter().print("Result is : "+ (i+j));
	    
//	   Same using object
//	   PrintWriter obj = res.getWriter();
//	   obj.print("Result is : "+(i+j));
		
		
		//Servelt calling servlet -  (i) Using requestDispacther  , (ii) using sendRedirect()
		
//		 req.setAttribute("k_is", k);       //only works when we use RequestDispatcher  , coz we pass the same res and req objects
//        RequestDispatcher obj =  req.getRequestDispatcher("square");
//        obj.forward(req, res);
		
		
//		res.sendRedirect("square?k="+k);     //URL rewriting-> to send data from this to other servlet        
        
        
//        HttpSession  session = req.getSession();    //using session
//        session.setAttribute("k",k);
		
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		
        res.sendRedirect("square");
     
	   
	}
}
