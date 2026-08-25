<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>

<html>
<body+>
<h2>Hello World!</h2>

<h1>This is an Account page</h2>

<form action= "getAccount" method = "post">
Enter your id <input type = "text" name="id">
<input type ="submit" value ="SEARCH">
</form>

<h2>${dto}</h2>

</body>
</html>

