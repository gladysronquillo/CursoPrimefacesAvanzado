package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Cultivo_antibiograma;

@Local
public interface Cultivo_antibiogramaFacadeLocal {
	void create(Cultivo_antibiograma cultivo_antibiograma);

	void edit(Cultivo_antibiograma cultivo_antibiograma);

	void remove(Cultivo_antibiograma cultivo_antibiograma);

	Cultivo_antibiograma find(Object id);

	List<Cultivo_antibiograma> findAll();
	
	List<Cultivo_antibiograma> findRange(int[] range);

	int count();
}
