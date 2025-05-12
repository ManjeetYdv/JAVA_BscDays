package DOA_layer;

import java.sql.*;

import com.mysql.cj.util.DnsSrv.SrvRecord;

import company.Student;

public class StudentDOA {
	
	public Student getStudObj(int id) throws SQLException {
	
		Student  student = new Student();
		student.setId(id);
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven" , "Manjeet" ,"HAha1100@");
			Statement statement = connection.createStatement();
			
			String queryString = "Select * from test where id="+id;
			
			ResultSet set = statement.executeQuery(queryString);
			
			set.next();
			student.setName(set.getString("name"));
			student.setSubject(set.getString("subject"));
			
			
			
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
		
	}

}
