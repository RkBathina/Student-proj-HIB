package com.dxc.service;

import java.util.List;

public interface UserService<E> {
	boolean edit(E e);
	boolean save(E e);
	boolean delete(int id);
	E find(int id);
	List<E> findAll();	

}
