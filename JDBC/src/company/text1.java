package company;
import java.io.Serial;
import java.sql.*;

public class text1 {
	
	public static void main(String[] args) throws Exception {
		
	
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/hospitaldb";
		String username ="Manjeet";
		String password = "HAha1100@";
		String queString ="select * from doctor";
		
		Connection connection = DriverManager.getConnection(url ,username ,password);
		
		Statement statement = connection.createStatement();
		
		ResultSet set = statement.executeQuery(queString);
		
//		set.next();      //will move pointer from col name to values;
//		System.out.println("Dno : "+set.getInt(1)+" || Dname :"+set.getString(2)+" || Specialization : "+set.getString(3));
//		
		while(set.next()) {
			System.out.println("Dno : "+set.getInt(1)+" || Dname :"+set.getString(2)+" || Specialization : "+set.getString(3));
		}
		
		int dno=12;
		String querryInsert =  "insert into doctor values(" +dno+ ", 'Striver' ,'Neurologist');"; //
		
		statement.executeUpdate(querryInsert);
		
		
		
		
		
		
		
		
		
		statement.close();connection.close();
			
	}

}
