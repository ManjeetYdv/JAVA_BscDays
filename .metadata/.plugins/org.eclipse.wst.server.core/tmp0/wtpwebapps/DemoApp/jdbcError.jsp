<%@page import="com.manjeet.ascd"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">

error

<%   ascd obj1 = new ascd();
     obj1.aString ="Manjeet";
     
     out.print(obj1.aString);
 %>

</body>
</html>