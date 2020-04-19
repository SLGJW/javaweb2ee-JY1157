package com.company.project.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logout-servlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LogoutServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html;GBK");
		response.setCharacterEncoding("GBK");
		request.setCharacterEncoding("GBK");

		PrintWriter out = response.getWriter();

		Cookie cname = new Cookie("name", "");
		Cookie cpass = new Cookie("pass", "");
		cname.setMaxAge(0);
		cpass.setMaxAge(0);
		response.addCookie(cname);
		response.addCookie(cpass);

		out.print("你已经成功注销!");
		out.print("<a href=\"http://localhost:8149/JavaEESCT_02_02/login.jsp\">重新登录请访问</a>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
