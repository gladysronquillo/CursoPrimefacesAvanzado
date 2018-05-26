package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Examen_sangre;

@Local
public interface Examen_sangreFacadeLocal {
	void create(Examen_sangre examen_sangre);

	void edit(Examen_sangre examen_sangre);

	void remove(Examen_sangre examen_sangre);

	Examen_sangre find(Object id);

	List<Examen_sangre> findAll();
	
	List<Examen_sangre> findRange(int[] range);

	int count();
}
