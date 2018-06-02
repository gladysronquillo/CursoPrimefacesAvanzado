package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Inmunologia;

@Local
public interface InmunologiaFacadeLocal {
	void create(Inmunologia inmunologia);

	void edit(Inmunologia inmunologia);

	void remove(Inmunologia inmunologia);

	Inmunologia find(Object id);

	List<Inmunologia> findAll();
	
	List<Inmunologia> findRange(int[] range);

	int count();
}
