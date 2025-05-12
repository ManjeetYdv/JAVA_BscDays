package com.manjeet;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/info")
public class StudentDetails_JSTL extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Students>studs = Arrays.asList(new Students(1, "Anuj") , new Students(2, "Bharti"));
        
		HttpSession session = req.getSession();
		session.setAttribute("Students",studs);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentInfo.jsp");
		requestDispatcher.forward(req, resp);
	}

}
