<%@page import="com.company.imformation.factory.StudentFactory"%>
<%@page import="com.company.imformation.vo.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息页</title>
</head>
<body>
<p><h1>好友列表</h1></p>
<a href = "Insert.jsp">添加好友</a>&nbsp;&nbsp;<a href = "select.jsp">查找好友</a>
<table>
	<tr class="tr">
		<th>好友ID</th>
		<th>姓名</th>
		<th>出生日期</th>
		<th></th>
		<th></th>
	</tr>
	<%
 	request.setCharacterEncoding("utf-8");
 %>
 	<% ArrayList<Student> list = StudentFactory.getStudentInstance().findAllStudents(); %>
 	<%
 		for(Student stu : list){
 	%>
 	<tr class="tr">
 		<td><%=stu.getSid() %></td>
 		<td><%=stu.getSname() %></td>
 		<td><%=stu.getSbirthday() %></td>
 		<td><a href = "Delete?sid=<%=stu.getSid() %>">删除</a></td>
 		<td><a href = "Select?info=<%=stu.getSid() %>&&open=update">修改</a></td>
 	</tr>
 <%} %>
</table>
</body>
</html>