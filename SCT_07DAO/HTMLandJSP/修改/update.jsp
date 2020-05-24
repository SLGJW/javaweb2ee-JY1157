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
</head>
<body>
<%  
        //通过DAO工厂获得DAO实现类实例  
        StudentDao studentDao = DAOFactory.getStudentDAOInstance();  
        //设置需要更新的用户  
       Student student = new Student();  
       student.setSid(request.getParameter("sid")) ;
       student.setSname(request.getParameter("sname")) ;
       student.setSbirthday(request.getParameter("sbirthday")) ;
       student.setSsex(request.getParameter("ssex")) ;
        //执行更新操作  
        studentDao.update(student);  
    %>  

</body>
</html>