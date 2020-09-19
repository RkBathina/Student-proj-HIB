package com.dxc.dao;

import java.util.List;

public interface EDAO<E>{
	boolean edit(E e);
	boolean save(E e);
	boolean delete(int eid);
	E find(int eid);
	List<E> findAll();	
}
