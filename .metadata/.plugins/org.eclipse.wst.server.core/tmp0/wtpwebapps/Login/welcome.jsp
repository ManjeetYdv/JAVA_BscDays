<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   
      <%  
      response.setHeader("Cache-Control", "no-cache , no-store  , must-revalidate");  //Http 1.1
      
      response.setHeader("Pragma" ,"no-cache");   //Http 1.0
      
      response.setHeader("Expires", "0"); //proxies
      
        if(session.getAttribute("username")==null){
        	 response.sendRedirect("login.jsp");
        }
        %>
        
        
         Welcome ${username}
          
          <a href="videos.jsp">Videos here</a>
          <a href="aboutUs.jsp">About Us</a>
</body>
</html>