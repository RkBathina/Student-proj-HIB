package com.dxc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.dxc.beans.Student1;
import com.dxc.hibconfig.HibConfig;

public class StudentDAO extends HibConfig implements DAO<Student1> {
	
	
	Session session;
	//SessionFactory sessionFactory;
	
	@Override
	public boolean edit(Student1 e) {
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
	public boolean save(Student1 e) {
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
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		//sessionFactory = HibConfig.getSessionFactory();
		session = getSessionFactory().openSession();
		session.beginTransaction();
		Student1 student = (Student1) session.get(Student1.class, id);
		session.delete(student);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	@Override
	public Student1 find(int id) {
		// TODO Auto-generated method stub
		//sessionFactory = HibConfig.getSessionFactory();
		session = getSessionFactory().openSession();
		session.beginTransaction();
		Student1 student = (Student1) session.get(Student1.class, id);
		session.getTransaction().commit();
		session.close();
		return student;
	}
	@Override
	public List<Student1> findAll() {
		// TODO Auto-generated method stub
		//sessionFactory = HibConfig.getSessionFactory();
		session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Student1");
		List<Student1> students = query.list();
		session.getTransaction().commit();
		session.close();
		return students;
	}

}
