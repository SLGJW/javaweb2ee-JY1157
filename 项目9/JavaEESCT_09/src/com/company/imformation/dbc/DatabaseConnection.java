package com.company.imformation.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";

	private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private static final String DBUSER = "scott";
	
	private static final String DBPASSWORD = "tiger";
	private Connection conn = null; 
	public DatabaseConnection() throws Exception {
		// TODO Auto-generated constructor stub
		Class.forName(DBDRIVER);
		this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
	}
	public Connection getConnection() {
		return this.conn;
	}
	public void close() {
		try {
			if (this.conn != null) {
				
				this.conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
