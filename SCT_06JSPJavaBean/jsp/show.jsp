<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息显示</title>
</head>
<% request.setCharacterEncoding("UTF-8");%>
<jsp:useBean id="student" scope="page" class="com.company.project.stu49.StudentBean" />
<jsp:setProperty name="student" property="*" />
<body>
<h1>学生信息获取</h1>
<h2>
    学号： <jsp:getProperty name="student" property="sId"/> <br>
    姓名： <jsp:getProperty name="student" property="sName"/> <br>
    性别： <jsp:getProperty name="student" property="sSex"/> <br>
</h2>
</body>
</html>
