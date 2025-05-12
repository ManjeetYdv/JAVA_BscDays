<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

           <%
             String name = request.getAttribute("Name").toString();
             out.print("Name : "+name);
             
           %>
           
           ${Name}<br>
           
           <c:out value="${Name}"></c:out>
           
           <!-- <c:import url="https://leetcode.com/ManjeetYdv/"></c:import> -->
           
           <c:set var="set" value="Value of set"></c:set>
           
           <c:out value="${set}"></c:out>
</body>
</html>