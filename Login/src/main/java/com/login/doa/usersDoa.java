package com.login.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class usersDoa {
		
	public boolean check(String uname  , String pswd) throws Exception {
		
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginD" , "Manjeet" ,"HAha1100@");
			
			String query ="Select * from users where name = ? and pswd = ?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, uname);
			statement.setString(2,  pswd);
		
			ResultSet set  =  statement.executeQuery();
			
			 if(set.next()) {
				 return true;
			 }
			 
			 return false;
			 
	}
	
	
}	
