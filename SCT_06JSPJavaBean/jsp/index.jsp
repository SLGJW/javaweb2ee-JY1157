<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息录入</title>
</head>
<body>
<h1>学生信息录入</h1>
<form action="show.jsp" method="post">
   <label> 学号：</label> <input type="text" name="sId"><br>
   <lable> 姓名：</lable><input type="text" name="sName"><br>
    性别：男<input type="radio" name="sSex" value="男">&nbsp;
            女<input type="radio" name="sSex" value="女"><br>
    <input type="reset" value="重置">
    <input type="submit" value="提交">
</form>
</body>
</html>
