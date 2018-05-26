package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Marcadores_tumorales;

@Local
public interface Marcadores_tumoralesFacadeLocal {
	void create(Marcadores_tumorales marcadores_tumorales);

	void edit(Marcadores_tumorales marcadores_tumorales);

	void remove(Marcadores_tumorales marcadores_tumorales);

	Marcadores_tumorales find(Object id);

	List<Marcadores_tumorales> findAll();
	
	List<Marcadores_tumorales> findRange(int[] range);

	int count();
}
