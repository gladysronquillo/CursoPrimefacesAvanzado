package com.kodigo.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class AgendarController implements Serializable {
	private static final long serialVersionUID = -8894794232382016219L;

	public String linkAgendar() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);
		
		bean.setDesabilitado(true);
		bean.limpiar();
		
		
		return "/protegido/agendar?faces-redirect=true";
	}

	public String linkContacto() {
		return "/protegido/contacto?faces-redirect=true";
	}

}
