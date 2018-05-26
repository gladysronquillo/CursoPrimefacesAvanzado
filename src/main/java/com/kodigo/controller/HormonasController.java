package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.HormonasFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Hormonas;

@Named
@SessionScoped
public class HormonasController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private HormonasFacadeLocal hormonasEjb;

	private Hormonas hormonas;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		hormonas = new Hormonas();
	}

	public void registrar(Integer id_paciente) {
		try {
			hormonas.setIdPaciente(id_paciente);

			Date fecha = new Date();

			hormonas.setFecha(fecha);
			hormonasEjb.create(hormonas);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			bean.eliminarPaciente(id_paciente);

			desabilitado = false;
			hormonas = new Hormonas();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		hormonas = new Hormonas();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Hormonas getHormonas() {
		return hormonas;
	}

	public void setHormonas(Hormonas hormonas) {
		this.hormonas = hormonas;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
