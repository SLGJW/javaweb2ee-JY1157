<%@page import="com.company.dao.imp.StudentDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="com.company.vo.*,com.company.factory.*"%>
    <%@ page import="com.company.dao.*"%>
<%@ page import="java.text.*"%>
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
    Student student2 = new Student() ;
    student2.setSid(request.getParameter("sid")) ;
    student2.setSname(request.getParameter("sname")) ;
    student2.setSbirthday(request.getParameter("sbirthday")) ;
    student2.setSsex(request.getParameter("ssex")) ;
    try{
        
        if(DAOFactory.getStudentDAOInstance().insert(student2)){
    %>
            <h3>学生信息添加成功！</h3>
    <%
        } else {
    %>
            <h3>学生信息添加失败！</h3>
    <%
        }
    %>
    <%
    }catch(Exception e){
        e.printStackTrace() ;
    }
    %>




</body>
</html>