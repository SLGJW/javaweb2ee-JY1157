<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>succeed</title>
</head>
<body>
欢迎你<%=request.getAttribute("name") %>

<a href="http://localhost:8149/JavaEESCT_02_02/logout-servlet">注销</a>
</body>
</html>