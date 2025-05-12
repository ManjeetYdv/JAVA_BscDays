package com.manjeet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextAndCongif  extends HttpServlet{

	
	public void service(HttpServletRequest request , HttpServletResponse response) throws IOException {
		
		PrintWriter obj= response.getWriter();
		
		obj.print("Hi , i am a servlet");
		System.out.println("Hi ");
		
		ServletContext ctxContext = request.getServletContext();
		
//		String model = ctxContext.getInitParameter("Model");
		int  price = Integer.parseInt(ctxContext.getInitParameter("Price"));
		
		ServletConfig config =  getServletConfig();
		String model= config.getInitParameter("Model");
		
		
		
		obj.println("Phone model : " +model);
		obj.println();
		obj.println("Price : "+price);
		
	}
}
