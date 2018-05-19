package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Paciente_TipoExamen;

@Local
public interface Paciente_TipoExamenFacadeLocal {
	
	void create(Paciente_TipoExamen paciente_TipoExamen);

	void edit(Paciente_TipoExamen paciente_TipoExamen);

	void remove(Paciente_TipoExamen paciente_TipoExamen);

	Paciente_TipoExamen find(Object id);

	List<Paciente_TipoExamen> findAll();
	
	List<Paciente_TipoExamen> buscarDisponibles();

	List<Paciente_TipoExamen> findRange(int[] range);

	int count();
}
