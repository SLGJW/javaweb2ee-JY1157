package com.company.dao;

import java.util.List;

import com.company.vo.*;

public interface StudentDao {

	// 插入
	boolean insert(Student student);

	// 更新
	boolean update(Student student);

	// 删除
	boolean delete(String SID);

	// 主键查询
	Student findByID(String SID);

	// 按条件查询所有员工信息
	public List<Student> findAll(String keyWord) throws Exception;

}
