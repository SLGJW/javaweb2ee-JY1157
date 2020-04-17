package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		// 创建Session对象
		HttpSession session = request.getSession(true);
		// 设置Session过期时间30秒
		session.setMaxInactiveInterval(30);

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		if (name.equals("admin") && pass.equals("123456")) {
			// 2.创建User对象保存账号、密码
			session.setAttribute("name", name);
			session.setAttribute("pass", pass);

			// 4.登陆成功跳转指定页面
			response.sendRedirect("ReadSessionServlet");
		} else {
			out.println("账号或密码错误，请从新输入....");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
