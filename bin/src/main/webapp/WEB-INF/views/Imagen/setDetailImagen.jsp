<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
   <form:form method = "POST" action = "/Gamachicaswindow/PostImg"  enctype="multipart/form-data">
    <p>File to upload: <input type="file" name="file"></p>
    <p><input type="submit" value="Upload"> Press here to upload the file!</p>
     </form:form>
</body>
</html>