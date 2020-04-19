package com.company.project.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add-cookie")
public class AddCookieServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddCookieServlet1() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html;utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		
		PrintWriter out = response.getWriter();
		
		if (name.equals("admin") && pass.equals("123456")) {
			
			System.out.println("用户名密码输入正确开始创建cookie！");
			
			/**
			 * 创建Cookie对象
			 */
			Cookie namecookie = new Cookie("name", name);
			Cookie passcookie = new Cookie("pass", pass);
			/**
			 * 给客户端添加Cookie
			 */
			response.addCookie(namecookie);
			response.addCookie(passcookie);
			
			
			System.out.println("创建cookie对象成功！");
			
			/**
			 * 检测从请求参数中获取到的用户名和密码.
			 */
			System.out.println(name);
			System.out.println(pass);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/page/succeed.jsp");
			
			request.setAttribute("name", name);
			
			dispatcher.forward(request, response);
			
			
		} else {
			out.println("账号或密码错误，请从新输入....");
		}
		out.close();
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
