<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="/gamachicas.com.pe/addProduct"> 
<h1>hola</h1>
 <form:input path="idimagen"/> 
<input type="submit" value="enviar"> 
</form:form> 
${Welcome}

</body>
</html>