package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Examen_heces;

@Local
public interface Examen_hecesFacadeLocal {
	void create(Examen_heces examen_heces);

	void edit(Examen_heces examen_heces);

	void remove(Examen_heces examen_heces);

	Examen_heces find(Object id);

	List<Examen_heces> findAll();
	
	List<Examen_heces> findRange(int[] range);

	int count();
}
