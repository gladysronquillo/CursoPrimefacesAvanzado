package com.kodigo.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
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

	private Paciente_TipoExamen paciente_TipoExamen;
	

	@PostConstruct
	public void init() {
		
	}

	public void registrar(Integer id_paciente, Integer[] listaTipoExamenSeleccionados) {
		try {
			paciente_TipoExamen = new Paciente_TipoExamen();

			for (Integer i : listaTipoExamenSeleccionados) {
				paciente_TipoExamen.setId_paciente(id_paciente);
				paciente_TipoExamen.setId_tipo_examen(i.intValue());

				paciente_TipoExamenEjb.create(paciente_TipoExamen);
				paciente_TipoExamen = new Paciente_TipoExamen();
			}
			
		} catch (Exception e) {
			System.out.println("Error al registrar paciente_tipo_examen :" + e);
		}
	}

	
	
	

}
