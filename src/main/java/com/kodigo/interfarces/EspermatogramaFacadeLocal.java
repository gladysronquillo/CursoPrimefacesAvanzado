package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Espermatograma;

@Local
public interface EspermatogramaFacadeLocal {
	void create(Espermatograma espermatograma);

	void edit(Espermatograma espermatograma);

	void remove(Espermatograma espermatograma);

	Espermatograma find(Object id);

	List<Espermatograma> findAll();
	
	List<Espermatograma> findRange(int[] range);

	int count();
}
