package com.dxc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dxc.beans.Exam;
import com.dxc.hibconfig.HibConfig;

public class ExamDAO extends HibConfig implements EDAO<Exam> {
	
	Session session;
	//SessionFactory sessionFactory;

	@Override
	public boolean edit(Exam e) {
		// TODO Auto-generated method stub
		//sessionFactory = HibConfig.getSessionFactory();
		session = getSessionFactory().openSession();
		session.beginTransaction();
		session.update(e);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean save(Exam e) {
		// TODO Auto-generated method stub
		//sessionFactory = HibConfig.getSessionFactory();
		session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean delete(int eid) {
		// TODO Auto-generated method stub
		//sessionFactory = HibConfig.getSessionFactory();
		session = getSessionFactory().openSession();
		session.beginTransaction();
		Exam exam = (Exam) session.get(Exam.class, eid);
		session.delete(exam);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public Exam find(int eid) {
		// TODO Auto-generated method stub
		//sessionFactory = HibConfig.getSessionFactory();
		session = getSessionFactory().openSession();
		session.beginTransaction();
		Exam exam = (Exam) session.get(Exam.class, eid);
		session.getTransaction().commit();
		session.close();
		return exam;
	}

	@Override
	public List<Exam> findAll() {
		// TODO Auto-generated method stub
		//sessionFactory = HibConfig.getSessionFactory();
		session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Exam");
		List<Exam> exams = query.list();
		session.getTransaction().commit();
		session.close();
		return exams;
	}

}
