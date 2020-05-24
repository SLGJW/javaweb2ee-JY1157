package com.company.dao.proxy;

import java.util.List;

import com.company.dao.StudentDao;
import com.company.vo.Student;

public class StudentDaoProxy implements StudentDao {

	@Override
	public boolean insert(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String SID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findByID(String SID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll(String keyWord) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
