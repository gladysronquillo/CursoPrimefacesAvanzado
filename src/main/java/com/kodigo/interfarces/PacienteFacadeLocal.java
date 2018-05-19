package com.kodigo.interfarces;

import java.util.List;

import javax.ejb.Local;

import com.kodigo.model.Paciente;

@Local
public interface PacienteFacadeLocal {
	void create(Paciente paciente);

	void edit(Paciente paciente);

	void remove(Paciente paciente);

	Paciente find(Object id);

	List<Paciente> findAll();
	
	List<Paciente> findRange(int[] range);

	int count();
}
