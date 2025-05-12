<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="sql"  uri="http://java.sun.com/jsp/jstl/sql"%>
      <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
     
  
  <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/student" user="Manjeet" password="HAha1100@"/>
  
  <!--  var res working same a resultSet in jdbc -->
  
  <sql:query var="res" dataSource="${db}"> Select * from info</sql:query>
  
  <c:forEach items="${res.rows}" var="students_info">
      
    <c:out value="${students_info.Sid }"></c:out> : <c:out value="${students_info.Sname }"></c:out> <br>
  

   
  </c:forEach>
  
  
</body>
</html>