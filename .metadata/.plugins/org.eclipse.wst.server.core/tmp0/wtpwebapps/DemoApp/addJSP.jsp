<%@page import="javax.print.attribute.standard.PagesPerMinute"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan"> 

  
 		<%@ include file="includeTest.jsp" %>  
		<%
		int i = Integer.parseInt(request.getParameter("num1")) ;
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k =i+j;
		
		out.print("Sum is : "+ k);
		
		pageContext.setAttribute("name", "Bharti" , pageContext.SESSION_SCOPE);
	    String name = (String)pageContext.getAttribute("name" , pageContext.SESSION_SCOPE);
	    out.print("Name : "+name);
		%>
		
		<%=k %>

     

</body>
</html>
