package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Bacteriologia;

@Local
public interface BacteriologiaFacadeLocal {
	void create(Bacteriologia bacteriologia);

	void edit(Bacteriologia bacteriologia);

	void remove(Bacteriologia bacteriologia);

	Bacteriologia find(Object id);

	List<Bacteriologia> findAll();
	
	List<Bacteriologia> findRange(int[] range);

	int count();
}
