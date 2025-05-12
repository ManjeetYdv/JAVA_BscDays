package com.manjeet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/demo")

@WebServlet( 
		name ="DemoServlet" ,
		urlPatterns = {"/demo" , "/demo2"} ,
		description = "expt on webServlet annotations"  ,
		
		initParams = 
	     {
			@WebInitParam(name = "rollNum" ,value = "5722"), 
			@WebInitParam(name ="goal" , value = "JAVA Developer")
	    }
     )
public class AnnotationsDemo  extends HttpServlet{

	public void service(HttpServletRequest request , HttpServletResponse response) throws IOException  {
		
	
		PrintWriter out = response.getWriter();
		out.println("XYZ");
		String nameString = getInitParameter("rollNum");
		String currGoal = getInitParameter("goal");
		
		out.print("<br>");
		out.print("Name : "+ nameString); out.print("<br>");
		out.print("CurrGoal : "+currGoal);
		
	}
}
