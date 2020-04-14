package sct_02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.PasswdUserDatabase;

@WebServlet("/ReadCookieServlet")
public class ReadCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReadCookieServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] cookies = null;
		
		// 获取与该域相关的 Cookie 的数组
		cookies = request.getCookies();
		 // 设置响应内容类型
		response.setContentType("text/html;utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		//遍历cookie
		 if (cookies != null) {
	            String name = cookies[0].getValue();
	            if (!name.equals("") || name != null) {
	            	out.print("登录系统成功!");
	    			out.print("<br>您好, " + name + "<br>");

	    			out.print("<a href=\"http://localhost:8149/JavaEESCT_02/LogoutServlet\">注销</a>");
	            }
	        } else {
	            out.print("请先登录~");
	            
	        }
   

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
