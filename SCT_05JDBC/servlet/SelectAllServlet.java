package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectAllServlet")
public class SelectAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 声明“数据库连接对象”，单例模式
	private static Connection conn;

	public SelectAllServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");

		 try {
			// 加载“驱动类”  SPI
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
	         
	            //第三步：执行sql语句 
	            String sql = "select * from student";
	            Statement st = conn.createStatement();
	            ResultSet rs = st.executeQuery(sql);
	             
	            //第四步：将结果集中的数据提取
	            PrintWriter pw = response.getWriter();
	            pw.write("<a href=\"addstudent.jsp\">添加学生</a>"+"<br/>");
	            pw.write("<a href=\"select.html\">查找学生</a>"+"<br/>");
	            pw.write("<a href=\"delete.html\">删除学生信息</a>"+"<br/>");
	            pw.write("<a href=\"update.html\">修改信息</a>"+"<br/>");
	            pw.write("<table>");
	            pw.write("<tr>");
	            pw.write("<th>ID</th>");
	            pw.write("<th>姓名</th>");
	            pw.write("<th>生日</th>");
	            pw.write("<th>性别</th>");
	            pw.write("</tr>");
	            while(rs.next()) {
	                pw.write("<tr>");
	                pw.write("<td>"+rs.getString("sid")+"</td>");
	                pw.write("<td>"+rs.getString("sname")+"</td>");
	                pw.write("<td>"+rs.getString("sbirthday")+"</td>");
	                pw.write("<td>"+rs.getString("ssex")+"</td>");
	                pw.write("</tr>");
	            }
	            pw.write("</table>");
	            //第五步：关闭连接
	            conn.close();
	        }catch(Exception ex) {
	            ex.printStackTrace();
	        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
