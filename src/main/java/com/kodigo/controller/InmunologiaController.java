package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.InmunologiaFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Inmunologia;

@Named
@SessionScoped
public class InmunologiaController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private InmunologiaFacadeLocal inmunologiaEjb;

	private Inmunologia inmunologia;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		inmunologia = new Inmunologia();
	}

	public void registrar(Integer id_paciente) {
		try {
			inmunologia.setIdPaciente(id_paciente);

			Date fecha = new Date();

			inmunologia.setFecha(fecha);
			inmunologiaEjb.create(inmunologia);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			bean.eliminarPaciente(id_paciente);

			desabilitado = false;
			inmunologia = new Inmunologia();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		inmunologia = new Inmunologia();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Inmunologia getInmunologia() {
		return inmunologia;
	}

	public void setInmunologia(Inmunologia inmunologia) {
		this.inmunologia = inmunologia;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
