package sct_02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		PrintWriter out = response.getWriter();

		if (name.equals("admin") && pass.equals("123456")) {

			out.print("登录系统成功!");
			out.print("<br>您好, " + name + "<br>");

			out.print("<a href=\"http://localhost:8149/JavaEESCT_02/LogoutServlet\">注销</a>");
			// 为用户名和密码创建cookie
			Cookie cname = new Cookie("name", name);
			Cookie cpass = new Cookie("pass", pass);

			cname.setMaxAge(30);
			cpass.setMaxAge(30);

			// 在响应头中添加Cookie
			response.addCookie(cname);
			response.addCookie(cpass);

		} else {
			out.print("抱歉，用户名或密码错误!");

		}

		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
