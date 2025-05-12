package company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.*;




public class PrepareedStatement {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/hospitaldb";
		String username ="Manjeet";
		String password = "HAha1100@";
		Connection connection = DriverManager.getConnection(url , username , password);
		 
		String query = "insert into doctor values(? , ? , ?);";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		int dno =18;
		String Dname = "Anuj Otaku";
		String dcotroString = "Oppailogist";
		
		statement.setInt(1, dno);
		statement.setString(2, Dname);
		statement.setString(3 ,  dcotroString);
		
		int count  = statement.executeUpdate();
		
		 dno =19;
		 Dname = "Anuj Otaku";
		 dcotroString = "Oppailogist";
		
		statement.setInt(1, dno);
		statement.setString(2, Dname);
		statement.setString(3 ,  dcotroString);
		
	     count  += statement.executeUpdate();
		
		System.out.println(count+" rows affected");
		
		
		String query2 = "select * from doctor";
		Statement statement2 = connection.createStatement();
		
		ResultSet set = statement2.executeQuery(query2);
		
		while(set.next()) {
			System.out.println("Dno : "+set.getInt(1)+" || Dname :"+set.getString(2)+" || Specialization : "+set.getString(3));
		}
		
		
		
		statement.close();
		statement2.close();
		connection.close();

	
	}
}
