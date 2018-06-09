package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.Marcadores_tumoralesFacadeLocal;
import com.kodigo.model.Paciente;
import com.kodigo.model.Marcadores_tumorales;

@Named
@SessionScoped
public class Marcadores_tumoralesController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private Marcadores_tumoralesFacadeLocal marcadores_tumoralesEjb;

	private Marcadores_tumorales marcadores_tumorales;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		marcadores_tumorales = new Marcadores_tumorales();
	}

	public void registrar(Integer id_paciente) {
		try {
			marcadores_tumorales.setIdPaciente(id_paciente);

			Date fecha = new Date();

			marcadores_tumorales.setFecha(fecha);
			marcadores_tumoralesEjb.create(marcadores_tumorales);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			FacesContext contextTipoExamen = FacesContext.getCurrentInstance();
			TipoExamenController beanTipoExamen = contextTipoExamen.getApplication().evaluateExpressionGet(contextTipoExamen,
					"#{tipoExamenController}", TipoExamenController.class);
						
			Integer id_tipo_examen=  beanTipoExamen.getId_tipo_examen();
			bean.eliminarPaciente(id_paciente, id_tipo_examen);

			desabilitado = false;
			marcadores_tumorales = new Marcadores_tumorales();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		marcadores_tumorales = new Marcadores_tumorales();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Marcadores_tumorales getMarcadores_tumorales() {
		return marcadores_tumorales;
	}

	public void setMarcadores_tumorales(Marcadores_tumorales marcadores_tumorales) {
		this.marcadores_tumorales = marcadores_tumorales;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
