package com.org.mvcdemo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.mvcdemo.factory.DAOFactory;
import com.org.mvcdemo.vo.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String path = "login.jsp";
			request.setCharacterEncoding("utf-8");
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String info = "";
			HttpSession session = request.getSession();
			if("".equals(name) || name == null || "".equals(password) || password ==null) {
				info = "用户名或密码不能为空！";
			}
			if (info == "") {
				User user = new User();
				user.setName(name);
				user.setPassword(password);
				System.out.println(user.getName());
				try {
					if (DAOFactory.getIUserDAOInstance().findLogin(user)) {
						session.setAttribute("name", name);
						response.sendRedirect("index.jsp");
						return;
					}else {
						info = "登录失败！";
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}				
			}
			if (info != null) {
				session.setAttribute("info", info);
				response.sendRedirect(path);
				return;
				
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
