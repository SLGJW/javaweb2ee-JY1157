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
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int num = (int) Math.ceil(Math.random() * 100000000);
		String userid = num + "";
		String info = null;
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String sex = request.getParameter("sex");
		User user = new User();
		user.setUserid(userid);
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		user.setSex(sex);
		HttpSession session = request.getSession();
		try {
			if (DAOFactory.getIUserDAOInstance().doInsert(user)) {
				response.sendRedirect("login.jsp");return;
			}else {
				info = "×¢²áÊ§°Ü";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("info", info);
		response.sendRedirect("sign.jsp");return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
