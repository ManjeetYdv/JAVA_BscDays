package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import DOA_layer.StudentDOA;
import company.Student;

@WebServlet("/getDetails")
public class GetDetails extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		
		int id =  Integer.parseInt(request.getParameter("ID"));
		
	    StudentDOA studentDOA = new StudentDOA();
	    Student stud = new Student();
	    stud.setId(id);
		try {
			stud = studentDOA.getStudObj(id);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	     
	     
	     HttpSession session = request.getSession();
	     session.setAttribute("Stud", stud);
	   
	    
	     response.sendRedirect("Showdetails.jsp");
	   
	   
	  	
	  }

	
	} 


