<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<html>
<body>
<h2>TO-DO LIST!</h2>

          <form action="Add_Task" method="post">
              <input type="text"  name="newTask" style="width: 300px;  height : 40px;  font-size:20px;">
              <button type="submit">Add Task</button>
          </form>
          
          
       
          
          <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/todo" user="Manjeet" password="HAha1100@"/>
           
           <sql:query var="res" dataSource="${db}">Select * from tasktable</sql:query> 
           
           <c:forEach items="${res.rows}" var="data">
           
              <c:out value="${data.task}"></c:out><br>
            </c:forEach>       
          
         
          
</body>

</html>