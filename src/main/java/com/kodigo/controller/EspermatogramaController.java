package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.EspermatogramaFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Espermatograma;

@Named
@SessionScoped
public class EspermatogramaController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private EspermatogramaFacadeLocal espermatogramaEjb;

	private Espermatograma espermatograma;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		espermatograma = new Espermatograma();
	}

	public void registrar(Integer id_paciente) {
		try {
			espermatograma.setIdPaciente(id_paciente);

			Date fecha = new Date();

			espermatograma.setFecha(fecha);
			espermatogramaEjb.create(espermatograma);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			bean.eliminarPaciente(id_paciente);

			desabilitado = false;
			espermatograma = new Espermatograma();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		espermatograma = new Espermatograma();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Espermatograma getEspermatograma() {
		return espermatograma;
	}

	public void setEspermatograma(Espermatograma espermatograma) {
		this.espermatograma = espermatograma;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
