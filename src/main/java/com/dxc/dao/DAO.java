package com.dxc.dao;

import java.util.List;

public interface DAO<E>{
	
	boolean edit(E e);
	boolean save(E e);
	boolean delete(int id);
	E find(int id);
	List<E> findAll();	

}
