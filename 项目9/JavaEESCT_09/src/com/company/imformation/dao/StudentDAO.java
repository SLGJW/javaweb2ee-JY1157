package com.company.imformation.dao;

import java.util.ArrayList;

import com.company.imformation.vo.Student;

public interface StudentDAO {
	public boolean InsertStudent(Student stu) throws Exception;
	public boolean DeleteStudent(String sid) throws Exception;
	public boolean UpdateStudent (Student sid) throws Exception;
	public ArrayList<Student> findAllStudents() throws Exception;
	public ArrayList<Student> findByMessage(String info) throws Exception;
}
