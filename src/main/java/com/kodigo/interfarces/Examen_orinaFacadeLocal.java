package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Examen_orina;

@Local
public interface Examen_orinaFacadeLocal {
	void create(Examen_orina examen_orina);

	void edit(Examen_orina examen_orina);

	void remove(Examen_orina examen_orina);

	Examen_orina find(Object id);

	List<Examen_orina> findAll();
	
	List<Examen_orina> findRange(int[] range);

	int count();
}
