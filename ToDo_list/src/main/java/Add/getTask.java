package Add;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getTasks")
public class getTask extends HttpServlet {

	

	public void service(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
		
		
		List<String> taskStrings = new ArrayList<>();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo" , "Manjeet" ,"HAha1100@");
			Statement statement = connection.createStatement();
			String qString ="Select * from tasktable";
			ResultSet set = statement.executeQuery(qString);
			
			while(set.next()) {
				String string = set.getString("task");
				taskStrings.add(string);
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		request.setAttribute("AllTasks", taskStrings);
		request.getRequestDispatcher("taskShow.jsp").forward(request, response);
	
	}
}
