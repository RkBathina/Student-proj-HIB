package com.dxc.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.dxc.beans.Student1;
import com.dxc.dao.StudentDAO;


public class StudentServiceImpl implements StudentService<Student1> {

	@SuppressWarnings("finally")
	@Override
	public boolean save(Student1 e) {
		// TODO Auto-generated method stub
		boolean res = false;
		try {
			StudentDAO studentDAO = new StudentDAO();
			res = studentDAO.save(e);
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			return res;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public boolean edit(Student1 e) {
		// TODO Auto-generated method stub
		boolean res = false;
		try {
			StudentDAO studentDAO = new StudentDAO();
			res = studentDAO.edit(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			return res;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		boolean res = false;
		try {
			StudentDAO studentDAO = new StudentDAO();
			res = studentDAO.delete(id);
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			return res;
		}
		
	}

	@SuppressWarnings("finally")
	@Override
	public Student1 find(int id) {
		// TODO Auto-generated method stub
		Student1 student1 = null;
		try {
			StudentDAO studentDAO = new StudentDAO();
			student1 = studentDAO.find(id);
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			return student1;
		}
		
	}

	@SuppressWarnings("finally")
	@Override
	public List<Student1> findAll() {
		// TODO Auto-generated method stub
		List<Student1> students = null;
		try {
			StudentDAO studentDAO = new StudentDAO();
			students = studentDAO.findAll();
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			return students;
		}
	}

}
