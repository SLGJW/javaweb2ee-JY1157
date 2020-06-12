package com.org.mvcdemo.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
	private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";

	private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private static final String DBUSER = "scott";
	
	private static final String DBPASSWORD = "tiger";
	private Connection conn = null;
	
	public DatabaseConnection() throws Exception {
		Class.forName(DBDRIVER);
		this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
	}
	public Connection getConnection() {
		return this.conn;
	}
	public void close() throws Exception {
		this.conn.close();
	}
}
