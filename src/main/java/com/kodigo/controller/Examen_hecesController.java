package com.kodigo.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.kodigo.interfarces.Examen_hecesFacadeLocal;
import com.kodigo.model.Examen_heces;
import com.kodigo.model.Paciente;

@Named
@SessionScoped
public class Examen_hecesController implements Serializable {
	private static final long serialVersionUID = 7868279604883358623L;

	@EJB
	private Examen_hecesFacadeLocal examen_hecesEjb;

	private Examen_heces examen_heces;
	private boolean desabilitado = true;

	@PostConstruct
	public void init() {
		examen_heces = new Examen_heces();
	}

	public void registrar(Integer id_paciente) {
		try {
			examen_heces.setIdPaciente(id_paciente);

			Date fecha = new Date();

			examen_heces.setFecha(fecha);
			examen_hecesEjb.create(examen_heces);

			FacesContext context = FacesContext.getCurrentInstance();
			Paciente_TipoExamenController bean = context.getApplication().evaluateExpressionGet(context,
					"#{paciente_TipoExamenController}", Paciente_TipoExamenController.class);
			
			FacesContext contextTipoExamen = FacesContext.getCurrentInstance();
			TipoExamenController beanTipoExamen = contextTipoExamen.getApplication().evaluateExpressionGet(contextTipoExamen,
					"#{tipoExamenController}", TipoExamenController.class);
						
			Integer id_tipo_examen=  beanTipoExamen.getId_tipo_examen();
			bean.eliminarPaciente(id_paciente, id_tipo_examen);

			desabilitado = false;
			examen_heces = new Examen_heces();

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Se genero correctamente"));

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Por favor intente más tarde"));
			System.out.println("Error al registrar examen Serología :" + e);
		}
	}

	public String regresar(Paciente paciente) {
		examen_heces = new Examen_heces();

		FacesContext context = FacesContext.getCurrentInstance();
		PacienteController bean = context.getApplication().evaluateExpressionGet(context, "#{pacienteController}",
				PacienteController.class);

		bean.leerId(paciente);
		desabilitado = true;
		return "/protegido/agendar?faces-redirect=true";
	}

	public Examen_heces getExamen_heces() {
		return examen_heces;
	}

	public void setExamen_heces(Examen_heces examen_heces) {
		this.examen_heces = examen_heces;
	}

	public boolean isDesabilitado() {
		return desabilitado;
	}

	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}

}
