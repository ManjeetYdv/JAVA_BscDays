<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
      <c:set var="str" value="Functional JSTL tags"></c:set>
      
      
      
     Length :  ${fn:length(str)} <br>
     
     Using split: 
     
     <c:forEach var="res" items="${fn:split(str  ,' ') }">
         
         ${res} <%="  || " %>
     </c:forEach>
     
     
     <br>
     
    Index of JSTL :  <c:out value="${fn:indexOf(str ,'JSTL') }"></c:out>  <br>
    
    <c:if test="${fn:contains(str , 'JSTL') }">
        Yes string contains JSTL at index ${fn:indexOf(str , "JSTL") }
    </c:if>
     

</body>
</html>