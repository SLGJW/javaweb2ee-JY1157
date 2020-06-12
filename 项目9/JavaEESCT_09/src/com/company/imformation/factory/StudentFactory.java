package com.company.imformation.factory;

import com.company.imformation.dao.StudentDAO;
import com.company.imformation.dao.proxy.StudentDAOProxy;

public class StudentFactory {
	public static StudentDAO getStudentInstance() throws Exception {
		return new StudentDAOProxy();
	}
}
