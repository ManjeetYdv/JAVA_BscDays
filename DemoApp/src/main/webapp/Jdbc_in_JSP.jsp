<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
       
      <%@ page import="java.sql.*" %>
      <%@ page errorPage="jdbcError.jsp" %>     
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
    <% 
   
        Class.forName("com.mysql.jdbc.Driver");
    
        String url ="jdbc:mysql://localhost:3306/student";
        String uname ="Manjeet";
        String password ="HAha1100@";
        
        Connection con = DriverManager.getConnection(url ,uname ,password);
        Statement st = con.createStatement();
   
    	ResultSet set = st.executeQuery("Select * from info where sid=1");
        
         set.next();
     %>
       
       Roll Number : <%=set.getInt(1) %> <br>
       Name : <%=set.getString(2) %>
	
</body>
</html>