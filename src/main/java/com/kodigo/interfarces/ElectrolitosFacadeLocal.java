package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Electrolitos;

@Local
public interface ElectrolitosFacadeLocal {
	void create(Electrolitos electrolitos);

	void edit(Electrolitos electrolitos);

	void remove(Electrolitos electrolitos);

	Electrolitos find(Object id);

	List<Electrolitos> findAll();
	
	List<Electrolitos> findRange(int[] range);

	int count();
}
