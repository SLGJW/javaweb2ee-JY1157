package com.company;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 声明“数据库连接对象”，单例模式
		private static Connection conn;
   
    public DeleteServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// 加载“驱动类” SPI
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 创建“URL连接字符串”。格式：jdbc:oracle:thin:@ 主机名/IP : 端口号 ：服务名称
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			// 创建“用户名”
			String username = "scott";
			// 创建“密码”
			String password = "tiger";

			// 初始化“数据库连接对象”
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("[操作提示]恭喜您，数据库连接成功！");

			//初始化预编译语句对象
			
			String sql = null;
			PreparedStatement statement = null;
			
			
			String sid = request.getParameter("sid");

			sql = "delete  student where sid =?";
			statement = conn.prepareStatement(sql);
			System.out.println("语句对象传入成功");

			// 动态传参
			statement.setString(1, sid);
			 statement.executeUpdate();
			
			System.out.println("删除成功！");

			

	
			
			

		} catch (Exception ex) {
			System.out.println("出错啦！");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
