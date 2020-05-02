<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
生日：<%= request.getAttribute("bir") %><br />
学号：<%= request.getAttribute("tel") %><br />
姓名：<%= request.getAttribute("name") %><br />
性别：<%= request.getAttribute("sex") %><br />
爱好：<%= request.getAttribute("active") %><br />





</body>
</html>