package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ReadSessionServlet")
public class ReadSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReadSession() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;utf-8");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String name = (String) session.getAttribute("name");
		String pass = (String) session.getAttribute("pass");
		
		if(name==null||pass==null){
            response.getWriter().print("您还未登陆，请点<a href=\"http://localhost:8149/JavaEESCT_02/index2.html\">登陆</a>重新登录");
        }else{
            
            out.print("您已登陆，欢迎您 "+name);
            out.print("<a href='Logout'>注销</a>");

            //5.创建Cookie对象用来保存Session的id
            Cookie cookie=new Cookie("JSESSIONID",session.getId());
            cookie.setMaxAge(30);
           // cookie.setPath("/Project01");
            response.addCookie(cookie);
        }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
