package com.dxc.service;

import java.util.List;

public interface ExamService<E> {
	boolean save(E e);
	boolean edit(E e);
	boolean delete(int eid);
	E find(int eid);
	List<E> findAll();
}
