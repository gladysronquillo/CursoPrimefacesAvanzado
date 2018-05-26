package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.Bioquimica_sanguineaFacadeLocal;
import com.kodigo.model.Bioquimica_sanguinea;
import com.kodigo.model.Paciente;

@Named
@SessionScoped
public class Bioquimica_sanguineaController implements Serializable {
	private static final long serialVersionUID = -7762192841558378970L;

	@EJB
	private Bioquimica_sanguineaFacadeLocal bioquimica_sanguineaEjb;

	private Bioquimica_sanguinea bioquimica_sanguinea;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		bioquimica_sanguinea = new Bioquimica_sanguinea();
	}

	public void registrar(Integer id_paciente) {
		try {
			bioquimica_sanguinea.setIdPaciente(id_paciente);

			Date fecha = new Date();

			bioquimica_sanguinea.setFecha(fecha);
			bioquimica_sanguineaEjb.create(bioquimica_sanguinea);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			bean.eliminarPaciente(id_paciente);

			desabilitado = false;
			bioquimica_sanguinea = new Bioquimica_sanguinea();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		bioquimica_sanguinea = new Bioquimica_sanguinea();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Bioquimica_sanguinea getBioquimica_sanguinea() {
		return bioquimica_sanguinea;
	}

	public void setBioquimica_sanguinea(Bioquimica_sanguinea bioquimica_sanguinea) {
		this.bioquimica_sanguinea = bioquimica_sanguinea;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
