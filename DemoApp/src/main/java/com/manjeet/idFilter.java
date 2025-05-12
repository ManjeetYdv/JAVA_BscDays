package com.manjeet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class idFilter
 */
@WebFilter("/filtertest")
public class idFilter implements Filter {


	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		String id =  ( req.getParameter("sid"));
		
		if(id.charAt(0)=='-') {
			id =id.substring(1);
		}
		
		boolean isDigit = true;
		for(int i=0 ;i<id.length();i++) {
		   if(!Character.isDigit(id.charAt(i))) {
				isDigit = false;
			}
		}
		
		if(!isDigit) {
			response.getWriter().print("Enter numeric");
		}
		else {

			int ID = Integer.parseInt(req.getParameter("sid"));
			if(ID>1) {
				chain.doFilter(request, response);
			}
			else {
				response.getWriter().print("Enter id greater than 1");
			}
		}
		
		
		

		// pass the request along the filter chain
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
