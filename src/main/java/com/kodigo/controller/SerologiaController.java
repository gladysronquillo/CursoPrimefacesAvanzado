package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.Paciente_TipoExamenFacadeLocal;
import com.kodigo.interfarces.SerologiaFacadeLocal;
import com.kodigo.model.Serologia;

@Named
@SessionScoped
public class SerologiaController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private SerologiaFacadeLocal serologiaEjb;
	
	@EJB
	private Paciente_TipoExamenFacadeLocal pacienteTipoExamenEJB;
	
	private Serologia serologia;

	

	@PostConstruct
	public void init() {
		serologia = new Serologia(); 
	}

	public void registrar(Integer id_paciente) {
		try {
			serologia.setIdPaciente(id_paciente);
			
			Date fecha = new Date();
			
			serologia.setFecha(fecha);
			serologiaEjb.create(serologia);
		
			pacienteTipoExamenEJB.eliminarPaciente(id_paciente);
			
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));
			
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public Serologia getSerologia() {
		return serologia;
	}

	public void setSerologia(Serologia serologia) {
		this.serologia = serologia;
	}

}
