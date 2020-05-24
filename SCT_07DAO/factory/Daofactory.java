package com.company.factory;

import com.company.dao.StudentDao;
import com.company.dao.imp.StudentDaoImpl;

public class DAOFactory {
	
	public static StudentDao getStudentDAOInstance(){  
        return new StudentDaoImpl() ;  
    }  

}
