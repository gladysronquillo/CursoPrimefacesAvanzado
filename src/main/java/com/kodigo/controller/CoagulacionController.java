package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.CoagulacionFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Coagulacion;

@Named
@SessionScoped
public class CoagulacionController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private CoagulacionFacadeLocal coagulacionEjb;

	private Coagulacion coagulacion;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		coagulacion = new Coagulacion();
	}

	public void registrar(Integer id_paciente) {
		try {
			coagulacion.setIdPaciente(id_paciente);

			Date fecha = new Date();

			coagulacion.setFecha(fecha);
			coagulacionEjb.create(coagulacion);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			bean.eliminarPaciente(id_paciente);

			desabilitado = false;
			coagulacion = new Coagulacion();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		coagulacion = new Coagulacion();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Coagulacion getCoagulacion() {
		return coagulacion;
	}

	public void setCoagulacion(Coagulacion coagulacion) {
		this.coagulacion = coagulacion;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
