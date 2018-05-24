package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.ElectrolitosFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Electrolitos;

@Named
@SessionScoped
public class ElectrolitosController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private ElectrolitosFacadeLocal electrolitosEjb;

	private Electrolitos electrolitos;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		electrolitos = new Electrolitos();
	}

	public void registrar(Integer id_paciente) {
		try {
			electrolitos.setIdPaciente(id_paciente);

			Date fecha = new Date();

			electrolitos.setFecha(fecha);
			electrolitosEjb.create(electrolitos);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			bean.eliminarPaciente(id_paciente);

			desabilitado = false;
			electrolitos = new Electrolitos();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		electrolitos = new Electrolitos();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Electrolitos getElectrolitos() {
		return electrolitos;
	}

	public void setElectrolitos(Electrolitos electrolitos) {
		this.electrolitos = electrolitos;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
