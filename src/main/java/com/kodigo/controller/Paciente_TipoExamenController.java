package com.kodigo.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.kodigo.interfarces.Paciente_TipoExamenFacadeLocal;
import com.kodigo.model.Paciente_TipoExamen;

@Named
@SessionScoped
public class Paciente_TipoExamenController implements Serializable {
	private static final long serialVersionUID = -2100646532889129175L;

	@EJB
	private Paciente_TipoExamenFacadeLocal paciente_TipoExamenEjb;

	private List<Paciente_TipoExamen> paciente_TipoExamen;

	public void listar(Integer id_paciente) {
		try {
			paciente_TipoExamen = paciente_TipoExamenEjb.buscarDisponibles(id_paciente);
		} catch (Exception e) {
			System.out.println("Error al listar lista de pacientes" + e);
		}
	}
	
	public void eliminarPaciente(Integer id_paciente) {
		try {
			paciente_TipoExamenEjb.eliminarPaciente(id_paciente);
		} catch (Exception e) {
			System.out.println("Error al listar lista de pacientes" + e);
		}
	}
	
	

	public List<Paciente_TipoExamen> getPaciente_TipoExamen() {
		return paciente_TipoExamen;
	}

	public void setPaciente_TipoExamen(List<Paciente_TipoExamen> paciente_TipoExamen) {
		this.paciente_TipoExamen = paciente_TipoExamen;
	}

}
