<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.company.dao.imp.StudentDaoImpl"%>
<%@ page import="com.company.vo.*,com.company.factory.*"%>
<%@ page import="com.company.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<title>删除用户记录</title>
</head>
<body>
	<%
		//通过DAO工厂获得DAO实现类实例  
		StudentDao studentDao = DAOFactory.getStudentDAOInstance();
		//执行删除操作  

		try {

			if (studentDao.delete(request.getParameter("sid"))) {
	%>
	<h3>学生信息删除成功！</h3>
	<%
		} else {
	%>
	<h3>学生信息删除失败！</h3>

	<%
		}
	%>
	<%
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
</body>
</html>
