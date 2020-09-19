package com.dxc.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.dxc.beans.Exam;
import com.dxc.dao.ExamDAO;
//import com.dxc.dao.ExamJdbcDAO;
//import com.dxc.dao.StudentJdbcDAO;

public class ExamServiceImpl implements ExamService<Exam> {

	@SuppressWarnings("finally")
	@Override
	public boolean save(Exam e) {
		// TODO Auto-generated method stub
		boolean res = false;
		try {
			ExamDAO examDAO = new ExamDAO();
			res = examDAO.save(e);
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			return res;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public boolean edit(Exam e) {
		// TODO Auto-generated method stub
		boolean res = false;
		try {
			ExamDAO examDAO = new ExamDAO();
			res = examDAO.edit(e);
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			return res;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public boolean delete(int eid) {
		// TODO Auto-generated method stub
		boolean res = false;
		try {
			ExamDAO examDAO = new ExamDAO();
			res = examDAO.delete(eid);
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			return res;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public Exam find(int eid) {
		// TODO Auto-generated method stub
		Exam exam = null;
		try {
			ExamDAO examDAO = new ExamDAO();
			exam = examDAO.find(eid);
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			return exam;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public List<Exam> findAll() {
		// TODO Auto-generated method stub
		List<Exam> exams = null;
		try {
			ExamDAO examDAO = new ExamDAO();
			exams = examDAO.findAll();
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			return exams;
		}
	}

}
