package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Serologia;

@Local
public interface SerologiaFacadeLocal {
	void create(Serologia serologia);

	void edit(Serologia serologia);

	void remove(Serologia serologia);

	Serologia find(Object id);

	List<Serologia> findAll();
	
	List<Serologia> findRange(int[] range);

	int count();
}
