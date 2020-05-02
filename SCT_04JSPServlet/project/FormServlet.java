package project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FormServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");

		String tel = request.getParameter("tel");
		String bir = request.getParameter("bir");
		String name = request.getParameter("name");
		
		request.setAttribute("tel", tel);
		request.setAttribute("bir", bir);
		request.setAttribute("name", name);
		
		System.out.println("学号"+tel);
		System.out.println("生日"+tel);
		System.out.println("姓名"+tel);
		

		//PrintWriter out = response.getWriter();

	
		String[] sex = request.getParameterValues("sex");
		for (String string1 : sex) {

			request.setAttribute("sex", string1);
			
		}

		String[] active = request.getParameterValues("active");

		
		for (String string : active) {
			request.setAttribute("active", string);

		}
		/*RequestDispatcher dispatcher = request.getRequestDispatcher("person.jsp");
				dispatcher.forward(request, response);*/
				
		response.sendRedirect("person.jsp");

	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
