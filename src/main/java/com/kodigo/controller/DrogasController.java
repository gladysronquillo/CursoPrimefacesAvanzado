package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.DrogasFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Drogas;

@Named
@SessionScoped
public class DrogasController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private DrogasFacadeLocal drogasEjb;

	private Drogas drogas;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		drogas = new Drogas();
	}

	public void registrar(Integer id_paciente) {
		try {
			drogas.setIdPaciente(id_paciente);

			Date fecha = new Date();

			drogas.setFecha(fecha);
			drogasEjb.create(drogas);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			bean.eliminarPaciente(id_paciente);

			desabilitado = false;
			drogas = new Drogas();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		drogas = new Drogas();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Drogas getDrogas() {
		return drogas;
	}

	public void setDrogas(Drogas drogas) {
		this.drogas = drogas;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
