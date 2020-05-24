package com.company.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseCoonection {
	
	private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";

	private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private static final String DBUSER = "scott";
	
	private static final String DBPASSWORD = "tiger";
	
	private static  Connection conn ;
	
	public static Connection getConnection() {
		// 判断“数据库连接对象”是否存在
		try {
			// 判断条件：连接对象不为空 并且 连接对象不是关闭的
			if (conn != null && !conn.isClosed()) {
				return conn;
				// 返回成功后，后面的代码将不会被执行。
			}

			// 加载“驱动类”  SPI
			Class.forName(DBDRIVER);
			// 创建“URL连接字符串”。格式：jdbc:oracle:thin:@ 主机名/IP : 端口号 ：服务名称
			String url = DBURL;

			// 创建“用户名”
			String username = DBUSER;
			// 创建“密码”
			String password = DBPASSWORD;

			// 初始化“数据库连接对象”
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("[操作提示]恭喜您，数据库连接成功！");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return conn;
	}
	
}
