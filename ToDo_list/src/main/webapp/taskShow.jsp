<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Tasks: </h2><br>

<br>
 

	<c:forEach items="${taskStrings}" var="task">
                
                <c:out value="${task.toString()}"></c:out>
	       
	</c:forEach>
	
     <%   
          List<String> res =(List) request.getAttribute("AllTasks"); 
          
          for(String s : res){
        	  out.print(s+"<br /> ");
          }
     
     
     %>
	
	   
</body>
</html>