package com.org.mvcdemo.dao.proxy;



import com.org.mvcdemo.dao.IUserDAO;
import com.org.mvcdemo.dao.impl.UserDAOImpl;
import com.org.mvcdemo.dbc.DatabaseConnection;
import com.org.mvcdemo.vo.User;

public class UserDAOProxy implements IUserDAO{
	 private DatabaseConnection dbc = null;
	 private IUserDAO dao = null;
	
	public  UserDAOProxy() {
		// TODO Auto-generated constructor stub
		try {
			this.dbc = new DatabaseConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dao = new UserDAOImpl(this.dbc.getConnection());
	}

	@Override
	public boolean findLogin(User user) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = this.dao.findLogin(user);
		this.dbc.close();
		return flag;
	}

	@Override
	public boolean doInsert(User user) throws Exception {
		boolean flag = false;
		flag = this.dao.doInsert(user);
		this.dbc.close();
		return flag;
	}

	@Override
	public User termFind(String info) throws Exception {
		User user = this.dao.termFind(info);
		this.dbc.close();
		return user;
	}
	
}
