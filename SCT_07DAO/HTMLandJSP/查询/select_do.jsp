<%@page import="com.company.dao.imp.StudentDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="com.company.vo.*,com.company.factory.*"%>
    <%@ page import="com.company.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%   request.setCharacterEncoding("UTF-8");    %>
<jsp:useBean id="student" scope="session"  class="com.company.vo.Student">
<jsp:setProperty name="student" property="*"/>
</jsp:useBean>
</head>
<body>

<%  
        //通过DAO工厂获得DAO实现类实例  
       StudentDao studentDao = DAOFactory.getStudentDAOInstance();  
        //指定按ID查询  
        Student student = studentDao.findById(request.getParameter("sid"));
        out.println("学号：" + student.getSid() + "<br>");  
        out.println("姓名：" + student.getSname()+ "<br>");  
        out.println("生日：" + student.getSbirthday()+ "<br>");  
        out.println("性别：" + student.getSsex()+ "<br>");  
    %>  

</body>
</html>