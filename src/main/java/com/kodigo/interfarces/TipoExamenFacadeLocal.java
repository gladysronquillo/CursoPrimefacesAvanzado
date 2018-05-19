package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.TipoExamen;

@Local
public interface TipoExamenFacadeLocal {
	
	void create(TipoExamen tipoExamen);

	void edit(TipoExamen tipoExamen);

	void remove(TipoExamen tipoExamen);

	TipoExamen find(Object id);

	List<TipoExamen> findAll();

	List<TipoExamen> findRange(int[] range);

	int count();
}
