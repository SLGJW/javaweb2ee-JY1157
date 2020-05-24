package com.company.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.dbc.DatabaseCoonection;

import com.company.dao.StudentDao;
import com.company.vo.Student;

public class StudentDaoImpl implements StudentDao {

	private Connection conn;

	public StudentDaoImpl() {
		this.conn = DatabaseCoonection.getConnection();
	}

	@Override
	public boolean insert(Student student) {

		boolean flag = false;
		String sql = null;
		PreparedStatement statement = null;
		int count = 0;

		try {
			// 初始化预编译语句对象

			sql = "INSERT INTO student  VALUES(?,?,?,?)";
			statement = conn.prepareStatement(sql);

			// 动态传参
			statement.setString(1, student.getSid());
			statement.setString(2, student.getSname());
			statement.setString(3, student.getSbirthday());
			statement.setString(4, student.getSsex());

			count = statement.executeUpdate();

			if (count > 0) {

				flag = true;

				System.out.println("数据插入成功！");

			} else {

				System.out.println("数据插入失败！");
			}

		} catch (SQLException e) {

			System.out.println("出错啦！");

		}

		return flag;
	}

	@Override
	public boolean update(Student student) {

		boolean flag = false;
		int count = 0;
		PreparedStatement statement = null;
		String sql = null;

		try {

			sql = "update student set sname=?,sbirthday=?,ssex = ? where sid = ?";

			statement = conn.prepareStatement(sql);

			// 动态传参
			statement.setString(4, student.getSid());
			statement.setString(1, student.getSname());
			statement.setString(2, student.getSbirthday());
			statement.setString(3, student.getSsex());

			count = statement.executeUpdate();

			if (count > 0) {

				flag = true;

				System.out.println("数据更新成功！");

			} else {

				System.out.println("数据更新失败！");
			}

		} catch (SQLException e) {

			System.out.println("出错啦！");
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return flag;
	}

	@Override
	public boolean delete(String SID) {

		boolean flag = false;
		int count = 0;
		PreparedStatement statement = null;
		String sql = null;

		try {

			sql = "delete student where sid = ?";

			statement = conn.prepareStatement(sql);

			statement.setString(1, SID);

			count = statement.executeUpdate();

			if (count > 0) {

				flag = true;

				System.out.println("数据删除成功！");

			} else {

				System.out.println("数据删除失败！");
			}

		} catch (SQLException e) {

			System.out.println("出错啦！");
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return flag;
	}

	@Override
	public Student findByID(String SID) {

		Student student = null;
		PreparedStatement statement = null;
		String sql = null;
		// 下面是针对数据库的具体操作
		try {

			sql = "select * from student where sid = ?";

			statement = conn.prepareStatement(sql);

			statement.setString(1, SID);
			// 进行数据库查询操作
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				// 查询出内容，之后将查询出的内容赋值给user对象
				student = new Student();
				student.setSid(rs.getString(1));
				student.setSname(rs.getString(2));
				student.setSbirthday(rs.getString(3));
				student.setSsex(rs.getString(4));
			}
			rs.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public List<Student> findAll(String keyWord) throws Exception {

		List<Student> all = new ArrayList<Student>();
		String sql = "SELECT * FROM student ";
		PreparedStatement pstmt = null;
		DatabaseCoonection dbc = null;

		// 下面是针对数据库的具体操作
		try {
			// 连接数据库
			dbc = new DatabaseCoonection();
			pstmt = dbc.getConnection().prepareStatement(sql);
			// 进行数据库查询操作
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				// 查询出内容，之后将查询出的内容赋值给user对象
				Student student = new Student();
				student.setSid(rs.getString(1));
				student.setSname(rs.getString(2));
				student.setSbirthday(rs.getString(3));
				student.setSsex(rs.getString(4));

				// 将查询出来的数据加入到List对象之中
				all.add(student);
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			throw new Exception("操作出现异常");
		}

		return all;
	}
}
