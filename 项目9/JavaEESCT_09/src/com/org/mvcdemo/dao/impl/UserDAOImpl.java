package com.org.mvcdemo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.org.mvcdemo.dao.IUserDAO;
import com.org.mvcdemo.vo.User;

public class UserDAOImpl implements IUserDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	public UserDAOImpl(Connection conn) {
		// TODO Auto-generated constructor stub
		this.conn = conn;
	}

	@Override
	public boolean findLogin(User user) throws Exception {
		boolean flag = false;
		// TODO Auto-generated method stub
		String sql = "select * from person where  pname= ? and ppassword = ?";
		this.pstmt = conn.prepareStatement(sql);
		this.pstmt.setString(1, user.getName());
		this.pstmt.setString(2, user.getPassword());
		ResultSet rs = this.pstmt.executeQuery();
		if (rs.next()) {
			
			flag = true;
		}
		rs.close();
		this.pstmt.close();
		this.conn.close();
		return flag;
	}
	public boolean doInsert(User user) throws Exception{
		boolean flag = false;
		// TODO Auto-generated method stub
		String sql = "insert into person values(?,?,?,?,?)";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, user.getUserid());
		this.pstmt.setString(2, user.getName());
		this.pstmt.setString(3, user.getPassword());
		this.pstmt.setString(4, user.getEmail());
		this.pstmt.setString(5, user.getSex());
		try {		
			if (this.pstmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		this.pstmt.close();
		this.conn.close();
		return flag;
	}
	public User termFind(String info) throws Exception {
		
		String sql = "select * from person where pname like ?  ";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, "%" + info + "%");
		ResultSet rs = this.pstmt.executeQuery();
		User user = new User();
		if(rs.next()) {
			user.setUserid(rs.getString(1));
			user.setName(rs.getString(2));
			user.setEmail(rs.getString(4));
			user.setSex(rs.getString(5));		
		}
		this.conn.close();
		return user;
	}

}
