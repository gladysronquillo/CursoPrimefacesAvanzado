package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Hormonas;

@Local
public interface HormonasFacadeLocal {
	void create(Hormonas hormonas);

	void edit(Hormonas hormonas);

	void remove(Hormonas hormonas);

	Hormonas find(Object id);

	List<Hormonas> findAll();
	
	List<Hormonas> findRange(int[] range);

	int count();
}
