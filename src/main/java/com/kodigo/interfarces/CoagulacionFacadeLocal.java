package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Coagulacion;

@Local
public interface CoagulacionFacadeLocal {
	void create(Coagulacion coagulacion);

	void edit(Coagulacion coagulacion);

	void remove(Coagulacion coagulacion);

	Coagulacion find(Object id);

	List<Coagulacion> findAll();
	
	List<Coagulacion> findRange(int[] range);

	int count();
}
