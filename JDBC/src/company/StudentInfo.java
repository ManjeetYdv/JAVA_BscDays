package company;
import java.security.spec.ECFieldF2m;
import java.sql.*;

class Student {
	int rollNum;
	String name;
	
	public Student() {
		
	}
	public Student(int rollNum, String name) {
		this.name =name;
		this.rollNum =rollNum;
	}
}


class StudentDOA{
	
	public Student getName(int roll) throws Exception {
		
		Student student =new Student();
		student.rollNum =roll;
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student" , "Manjeet" ,"HAha1100@");
		Statement st = con.createStatement();
		ResultSet set = st.executeQuery("Select Sname from info where Sid="+roll);
		set.next();
		student.name = set.getString(1);
		return student;
		
	}
	
	public void addStudent(Student s) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student" , "Manjeet" ,"HAha1100@");
		
        String query = "insert into info values(? ,?)";
		PreparedStatement  st = con.prepareStatement(query);
		st.setInt(1, s.rollNum);
		st.setString(2 ,s.name);
		
		st.executeUpdate();
	}
	
	public void showRecord()  throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student" , "Manjeet" ,"HAha1100@");
		Statement statement = con.createStatement();
		
		ResultSet set = statement.executeQuery("select * from info");
		
		System.out.println("Student Records");
		while(set.next()) {
			System.out.println("Roll Number : "+ set.getInt(1)+" || Name : "+set.getString(2));
		}
	}
	
	public void deleteStudent(int roll) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student" , "Manjeet" ,"HAha1100@");
		Statement statement = con.createStatement();
		
		String deleteQuery ="delete from info where Sid="+roll;
		statement.executeUpdate(deleteQuery);
		
	}
}
public class StudentInfo {
	
	public static void main(String[] args) throws Exception {
		
		StudentDOA studentDOA = new StudentDOA();
		Student student = studentDOA.getName(1);
		
		System.out.println("Student id : " + student.rollNum);
		System.out.println("Student name : "+student.name);
		
		
//		studentDOA.addStudent(new Student(3 , "Manish"));
		
		
		studentDOA.deleteStudent(3);
		studentDOA.showRecord();
		
		
	}

}
