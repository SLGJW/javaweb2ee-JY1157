package com.company;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.print.attribute.standard.Sides;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 声明“数据库连接对象”，单例模式
	private static Connection conn;

	public UpdateServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");

		// 加载“驱动类” SPI
		try {
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
			PreparedStatement statement = null;
			String sql = null;

			String sid = request.getParameter("sid");
			String sname = request.getParameter("sname");
			String sbirthday = request.getParameter("sbirthday");
			String ssex = request.getParameter("ssex");

			sql = "update student set sname = ?,sbirthday =to_date(?,'yyyy-mm-dd'),ssex = ? where sid = ?";
			statement = conn.prepareStatement(sql);

			// 动态传参
			statement.setString(1, sname);
			statement.setString(2,  sbirthday);
			statement.setString(3, ssex);
			statement.setString(4, sid);
			
			statement.executeUpdate();
            System.out.println("修改成功");
            statement.close();
            conn.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
