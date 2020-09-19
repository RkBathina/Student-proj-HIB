package com.dxc.service;

import java.util.List;

public interface StudentService<E> {
	
	boolean save(E e);
	boolean edit(E e);
	boolean delete(int id);
	E find(int id);
	List<E> findAll();

}
