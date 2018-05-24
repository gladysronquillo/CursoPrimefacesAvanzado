package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Drogas;

@Local
public interface DrogasFacadeLocal {
	void create(Drogas drogas);

	void edit(Drogas drogas);

	void remove(Drogas drogas);

	Drogas find(Object id);

	List<Drogas> findAll();
	
	List<Drogas> findRange(int[] range);

	int count();
}
