package com.dxc.dao;

import java.util.List;

public interface MDAO<E> {
	boolean save(E e);
	boolean edit(E e) ;
	boolean delete(int examid,int studentid);
	E find(int examid,int studentid) ;
	List<E> findAll() throws Exception;	

}
