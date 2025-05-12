package com.manjeet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSTLDemo")
public class JSTLDemo extends HttpServlet {
	
	public void service(HttpServletRequest request  , HttpServletResponse response) throws IOException, ServletException {
		
		
		String nameString ="Manjeet";
        request.setAttribute("Name", nameString);
        
       RequestDispatcher rDispatcher = request.getRequestDispatcher("JSTLjsp.jsp");
       rDispatcher.forward(request, response);
       
       
	} 

}
