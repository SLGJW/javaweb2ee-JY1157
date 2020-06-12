package com.org.mvcdemo.dao;



import com.org.mvcdemo.vo.User;

public interface IUserDAO {
	public boolean findLogin (User user) throws Exception;
	public boolean doInsert(User user) throws Exception;
	public User termFind(String info) throws Exception;
}
